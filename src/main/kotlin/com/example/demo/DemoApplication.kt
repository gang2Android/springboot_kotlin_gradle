package com.example.demo

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
class DemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java, *args)
}

/**
-- ----------------------------
-- Table for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
`id` int(11) DEFAULT NULL,
`name` varchar(255) DEFAULT NULL,
`age` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `user` VALUES ('1', '张三', '22');
INSERT INTO `user` VALUES ('2', '李四', '23');
INSERT INTO `user` VALUES ('3', '王五', '22');
INSERT INTO `user` VALUES ('4', '赵六', '23');

 */