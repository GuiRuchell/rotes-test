package com.assembly.votation.crud.repository

import org.apache.catalina.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface IUserRepository extends JpaRepository<User, Long> {

}