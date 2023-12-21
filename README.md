一：springboot自定义mybatis类型转换器的使用步骤（两步）：
    1:自定义类型转换器，继承BaseTypeHandler
    2:将自定义类型转换器注册到mybatis中,在yml中引入下面代码即可
        `mybatis:
          type-handlers-package: com.ml.typehandle`
