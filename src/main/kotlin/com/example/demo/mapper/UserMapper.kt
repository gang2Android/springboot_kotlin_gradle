package com.example.demo.mapper

import com.example.demo.entity.User
import org.apache.ibatis.annotations.Mapper

//@Repository
@Mapper
interface UserMapper {
    fun getUser(id: Int): User?
}