package com.monkey.snail.modules.test.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "测试类",description = "测试工具使用")
@Data
public class TestDemo {
 
    @ApiModelProperty(value = "姓名", required = true , name = "姓名" , allowEmptyValue = true )
    private String name;
    @ApiModelProperty(value = "性别", required = true)
    private String sex;
}