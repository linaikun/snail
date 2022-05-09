package com.monkey.snail.modules.test.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.monkey.snail.modules.test.entity.MybatisTest2Entity;
import com.monkey.snail.modules.test.entity.MybatisTestEntity;
import com.monkey.snail.modules.test.mapper.MybatisTest2Mapper;
import com.monkey.snail.modules.test.mapper.MybatisTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: 李迺锟
 * @Date: 2022/5/9 11:24
 * @Description:
 * @Version: V
 */
@RestController
@RequestMapping("/test")
public class MybatisTestController {
    @Autowired
    private MybatisTestMapper mybatisTestMapper;

    @Autowired
    private MybatisTest2Mapper mybatisTest2Mapper;

    /**
     * 查询所有数据
     */
    @GetMapping("/list")
    public void test(){
        List<MybatisTestEntity> list = mybatisTestMapper.selectList(null);
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i).getUserName());
            System.out.println(list.get(i).getPassWord());
        }
        List<MybatisTest2Entity> list1 = mybatisTest2Mapper.selectList(null);
        for (int i = 0;i<list1.size();i++){
            System.out.println(list1.get(i).getTestName());
            System.out.println(list1.get(i).getTestAdress());
        }

    }
}
   /* LambdaQueryWrapper<MybatisTestEntity> queryWrapper =new LambdaQueryWrapper<>();
        queryWrapper.eq(MybatisTestEntity::getPassWord,"123456");
                List<MybatisTestEntity> list = busmanagerService.list(queryWrapper);*/