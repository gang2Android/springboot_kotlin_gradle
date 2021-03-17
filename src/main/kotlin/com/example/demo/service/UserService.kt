package com.example.demo.service

import com.example.demo.entity.User
import com.example.demo.mapper.UserMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class UserService {
    @Autowired
    var userMapper: UserMapper? = null
    fun getUser(id: Int): User? {
        return userMapper!!.getUser(id)
    }

}