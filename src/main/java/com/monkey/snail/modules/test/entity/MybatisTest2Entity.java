package com.monkey.snail.modules.test.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Auther: 李迺锟
 * @Date: 2022/5/9 18:59
 * @Description:
 * @Version: V
 */
@Data
@TableName("test_table_ds")
public class MybatisTest2Entity {
    private String testName;
    private String testAdress;
}
