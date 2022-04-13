package com.monkey.snail.modules.test;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = "测试路由")
@RestController
@RequestMapping("/test")
public class TestController {
 
    @ApiOperation("测试get")
    @ApiImplicitParam(name = "name", value = "姓名", required = true)
    @GetMapping("test1")
    public String test1(@RequestParam(value = "name") String name) {
        return "hello," + name;
    }
 
    @ApiOperation("测试post")
    @PostMapping("test2")
    public String test2(@RequestBody TestEntity testEntity) {
        return testEntity.getName() + ":" + testEntity.getSex();
    }
}