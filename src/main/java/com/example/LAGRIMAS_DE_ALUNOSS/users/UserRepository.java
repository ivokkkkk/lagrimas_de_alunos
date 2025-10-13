package com.example.LAGRIMAS_DE_ALUNOSS.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<UserModel,Long> {
    UserDetails findByLogin(String login);

}
