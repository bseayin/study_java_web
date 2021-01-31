package com.xsz.file;

import java.io.Serializable;

public class TextContent implements Serializable {
    private Integer no;
    private  String content;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
