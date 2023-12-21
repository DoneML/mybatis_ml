package com.ml.service.impl;

import com.ml.domain.UserModel;
import com.ml.mapper.TestMapper;
import com.ml.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public List<UserModel> selectUserList() {
        return testMapper.selectUserList();
    }
}
