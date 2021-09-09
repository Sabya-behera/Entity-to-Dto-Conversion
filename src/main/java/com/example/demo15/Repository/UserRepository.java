package com.example.demo15.Repository;

import com.example.demo15.Model.User;
import com.example.demo15.Model.User_Dto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>
{
}