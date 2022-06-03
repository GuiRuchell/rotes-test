package com.assembly.votation.crud.service

import org.apache.catalina.User

interface IUserService {

    User findUserById(Long id);
}