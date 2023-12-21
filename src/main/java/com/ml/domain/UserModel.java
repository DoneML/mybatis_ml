package com.ml.domain;

import com.ml.enums.SexEnum;
import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class UserModel {

    private Integer id;

    private String name;

    private Integer age;

    private SexEnum sex;

}
