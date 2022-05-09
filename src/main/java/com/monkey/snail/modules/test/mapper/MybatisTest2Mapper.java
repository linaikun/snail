package com.monkey.snail.modules.test.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.monkey.snail.modules.test.entity.MybatisTest2Entity;
import com.monkey.snail.modules.test.entity.MybatisTestEntity;
import org.springframework.stereotype.Repository;

/**
 * @Auther: 李迺锟
 * @Date: 2022/5/9 18:59
 * @Description:
 * @Version: V
 */
@Repository
@DS("DS2")
public interface MybatisTest2Mapper extends BaseMapper<MybatisTest2Entity> {
}
