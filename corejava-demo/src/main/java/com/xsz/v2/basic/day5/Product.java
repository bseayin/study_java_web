package com.xsz.v2.basic.day5;

public class Product {
    private String name;
    private String createDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public boolean equals(Object o) {
        // 如果对象地址一样，则认为相同
        if (this == o)
            return true;
        // 如果参数为空，或者类型信息不一样，则认为不同
        if (o == null || getClass() != o.getClass())
            return false;
        Product product=(Product)o;
        if(this.name.equals(product.name) && this.createDate.equals(product.createDate)){
            return true;
        }else {
            return false;
        }

    }


    public String toString() {

        return "产品名字="+this.name+"  生产日期="+this.createDate;
    }
}
