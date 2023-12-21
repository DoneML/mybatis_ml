package com.ml.controller;

import com.ml.domain.UserModel;
import com.ml.service.TestService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("selectUserList")
    public List<UserModel> test (){
        List<UserModel> userModels = testService.selectUserList();
        return userModels;
    }

    @RequestMapping("insertUser")
    public void insertUser (@RequestBody UserModel userModel){
        testService.insertUser(userModel);
    }
}
