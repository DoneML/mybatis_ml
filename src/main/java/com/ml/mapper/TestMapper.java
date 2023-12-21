package com.ml.mapper;

import com.ml.domain.UserModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<UserModel> selectUserList();
}
