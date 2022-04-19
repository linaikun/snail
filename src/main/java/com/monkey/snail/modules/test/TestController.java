package com.monkey.snail.modules.test;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Tag;
import org.springframework.web.bind.annotation.*;

@Api(tags = "测试类")
@RestController
@RequestMapping("/test")
public class TestController {
 
    @ApiOperation("测试get方法")
    @ApiImplicitParam(name = "name", value = "姓名", required = true)
    @GetMapping("testGet")
    public String testGet(@RequestParam(value = "name") String name) {
        return "hello," + name;
    }
 
    @ApiOperation("测试post+实体类入参")
    @ApiOperationSupport(author = "ceshi",order =01 )
    @PostMapping("testPost")
    public String testPost(@RequestBody TestDemo testDemo) {
        return testDemo.getName() + ":" + testDemo.getSex();
    }
}