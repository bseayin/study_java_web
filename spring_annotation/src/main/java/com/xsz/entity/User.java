package com.xsz.entity;

import com.xsz.annotation.DateTime;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class User {
    @NotNull(message = "名字不能为空")
    @Size(min = 4, max = 10, message = "name 长度必须在 {min} - {max} 之间")
    private String name;

    @NotNull(message = "生日不能为空")
    @DateTime(format = "yyyyMMdd", message = "格式错误，正确格式为：yyyyMMdd")
    private String birthday;



}
