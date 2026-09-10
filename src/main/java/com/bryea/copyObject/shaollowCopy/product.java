package com.bryea.copyObject.shaollowCopy;

import java.util.List;

/**
 * ClassName: DeepCopy
 * Package: com.atguigu.copyObject
 * Description:
 *
 * @Author Freya
 * @Create 2025/2/24 9:24
 * @Version 1.0
 */
    /*
    在浅拷贝中，如果对象的属性是引用类型（例如一个对象或一个集合），
    那么源对象和目标对象会共享这些引用类型的属性。修改目标对象中
    的这些属性会影响源对象，因为它们指向同一个内存位置。
     */
public class product {
    private String name;
    private List<String> features;

    public product() {
    }

    public product(String name, List<String> features) {
        this.name = name;
        this.features = features;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }
}
