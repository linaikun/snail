package com.monkey.snail.modules.test.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Auther: 李迺锟
 * @Date: 2022/5/9 10:51
 * @Description:
 * @Version: V
 */
@Data
@TableName("test_table")
public class MybatisTestEntity {
    private String userName;
    private String passWord;
}
