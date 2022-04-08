package com.itlizeSession.product.Repository;

import com.itlizeSession.product.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,String > {
    User findByUserName(String user_name);
    List<User> findByRole(String role);

}