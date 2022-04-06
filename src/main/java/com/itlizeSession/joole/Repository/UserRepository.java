package com.itlizeSession.joole.Repository;

import com.itlizeSession.joole.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,String > {
    //List<User> findByRole(String role);
}