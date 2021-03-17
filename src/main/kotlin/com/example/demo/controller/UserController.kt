package com.example.demo.controller

import com.example.demo.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/testBoot")
class UserController {
    @Autowired
    var userService: UserService? = null

    @RequestMapping("getUser/{id}")
    fun getUser(@PathVariable id: Int): String {
        return userService!!.getUser(id).toString()
    }
}
