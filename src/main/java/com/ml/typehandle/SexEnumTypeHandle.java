package com.ml.typehandle;

import com.ml.enums.SexEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 自定义类型转换器可以直接继承BaseTypeHandler，后面有个泛型，泛型类型为需要处理的java类型，即SexEnum
 */
@Slf4j
public class SexEnumTypeHandle extends BaseTypeHandler<SexEnum> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, SexEnum parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, parameter.getValue());
        log.info("{}", parameter);
    }

    @Override
    public SexEnum getNullableResult(ResultSet rs, String columnName) throws SQLException {
        log.info("{}", columnName);
        Object object = rs.getObject(columnName);
        Integer sex = object != null && object instanceof Integer ? (Integer) object : null;
        return SexEnum.getByValue(sex);
    }

    @Override
    public SexEnum getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        log.info("{}", columnIndex);
        Object object = rs.getObject(columnIndex);
        Integer sex = object != null && object instanceof Integer ? (Integer) object : null;
        return SexEnum.getByValue(sex);
    }

    @Override
    public SexEnum getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        log.info("{}", columnIndex);
        Object object = cs.getObject(columnIndex);
        Integer sex = object != null && object instanceof Integer ? (Integer) object : null;
        return SexEnum.getByValue(sex);
    }
}
