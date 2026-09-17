import fs from "node:fs/promises";
import { SpreadsheetFile, Workbook } from "@oai/artifact-tool";

const outputDir = "/Users/mac/IdeaProjects/JavaNote/JavaReview/outputs/blogger-links";
const outputPath = `${outputDir}/喜欢的博主收藏表.xlsx`;
const previewPath = `${outputDir}/preview.png`;
const profileUrl = "https://space.bilibili.com/387976167";

const workbook = Workbook.create();
const sheet = workbook.worksheets.add("博主收藏");
sheet.showGridLines = false;
sheet.tabColor = "#E85D75";

sheet.getRange("A2:H2").merge();
sheet.getRange("A2").values = [["喜欢的博主收藏表"]];
sheet.getRange("A2").format = {
  font: { name: "Arial", size: 15, bold: true, color: "#1F2937" },
  verticalAlignment: "center",
};
sheet.getRange("A2:H2").format.rowHeight = 28;
sheet.getRange("A3:H3").merge();
sheet.getRange("A3").values = [["每位博主占一行；可按平台、内容分类或收藏日期筛选。"]];
sheet.getRange("A3").format = {
  font: { name: "Arial", size: 10, italic: true, color: "#6B7280" },
};

sheet.getRange("A4:H5").values = [
  ["序号", "平台", "博主昵称", "账号 / UID", "内容分类", "主页链接", "收藏日期", "备注"],
  [1, "哔哩哔哩", "待补充", "387976167", "待分类", profileUrl, new Date("2026-09-10T00:00:00+08:00"), "主页公开昵称暂未能可靠读取"],
];

const table = sheet.tables.add("A4:H5", true, "BloggerFavoritesTable");
table.style = "TableStyleMedium2";
table.showBandedRows = true;
table.showFilterButton = true;

sheet.getRange("A4:H4").format = {
  fill: "#C9364F",
  font: { name: "Arial", size: 10, bold: true, color: "#FFFFFF" },
  horizontalAlignment: "center",
  verticalAlignment: "center",
  wrapText: true,
  borders: { preset: "outside", style: "thin", color: "#A52A3E" },
};
sheet.getRange("A5:H5").format.font = { name: "Arial", size: 10, color: "#1F2937" };
sheet.getRange("A5:H5").format.verticalAlignment = "center";
sheet.getRange("A5:H5").format.rowHeight = 30;
sheet.getRange("A5:A500").format.horizontalAlignment = "center";
sheet.getRange("B5:B500").format.horizontalAlignment = "center";
sheet.getRange("D5:D500").format.horizontalAlignment = "center";
sheet.getRange("G5:G500").format.horizontalAlignment = "center";
sheet.getRange("G5:G500").setNumberFormat("yyyy-mm-dd");
sheet.getRange("F5:F500").format.font = { name: "Arial", size: 10, color: "#0563C1", underline: true };

sheet.getRange("B5:B500").dataValidation = {
  rule: { type: "list", values: ["哔哩哔哩", "YouTube", "抖音", "小红书", "微博", "快手", "其他"] },
};
sheet.getRange("E5:E500").dataValidation = {
  rule: { type: "list", values: ["待分类", "科技", "知识", "生活", "游戏", "影视", "音乐", "美食", "旅行", "财经", "其他"] },
};

sheet.getRange("A4:H5").format.borders = {
  insideHorizontal: { style: "thin", color: "#E5E7EB" },
  bottom: { style: "thin", color: "#D1D5DB" },
};
sheet.getRange("A4:H5").format.autofitRows();
const widths = [7, 13, 18, 16, 14, 40, 14, 32];
for (let i = 0; i < widths.length; i++) {
  sheet.getRangeByIndexes(0, i, 10, 1).format.columnWidth = widths[i];
}
sheet.getRange("H5:H500").format.wrapText = true;
sheet.freezePanes.freezeRows(4);

workbook.recalculate();
const check = await workbook.inspect({
  kind: "table",
  range: "博主收藏!A2:H5",
  include: "values,formulas",
  tableMaxRows: 10,
  tableMaxCols: 10,
});
console.log(check.ndjson);
const errors = await workbook.inspect({
  kind: "match",
  searchTerm: "#REF!|#DIV/0!|#VALUE!|#NAME\\?|#N/A|#NUM!|#NULL!|#SPILL!|#CALC!",
  options: { useRegex: true, maxResults: 100 },
  summary: "final formula error scan",
});
console.log(errors.ndjson);

await fs.mkdir(outputDir, { recursive: true });
const preview = await workbook.render({ sheetName: "博主收藏", range: "A1:H8", scale: 1.5, format: "png" });
await fs.writeFile(previewPath, new Uint8Array(await preview.arrayBuffer()));
const output = await SpreadsheetFile.exportXlsx(workbook);
await output.save(outputPath);
console.log(JSON.stringify({ outputPath, previewPath }));
