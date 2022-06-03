package com.assembly.votation.crud.controller

import com.assembly.votation.crud.service.UserServiceImpl
import org.apache.catalina.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('/user')
class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping('/{id}')
    @ResponseBody
    User getUser(@PathVariable Long id) {
        return userService.findUserById(id);
    }
}
