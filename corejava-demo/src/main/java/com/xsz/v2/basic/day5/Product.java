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
        // ��������ַһ��������Ϊ��ͬ
        if (this == o)
            return true;
        // �������Ϊ�գ�����������Ϣ��һ��������Ϊ��ͬ
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

        return "��Ʒ����="+this.name+"  ��������="+this.createDate;
    }
}
