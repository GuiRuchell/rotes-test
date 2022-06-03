package com.assembly.votation.crud.service

import com.assembly.votation.crud.repository.IUserRepository
import org.apache.catalina.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl implements IUserService {

    @Autowired
    IUserRepository iUserRepository

    @Override
    User findUserById(Long id) {
        iUserRepository.findById(id)
    }
}
