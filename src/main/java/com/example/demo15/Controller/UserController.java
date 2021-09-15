package com.example.demo15.Controller;

import com.example.demo15.Model.User;
import com.example.demo15.Model.User_Dto;
import com.example.demo15.Repository.UserRepository;
import com.example.demo15.Service.ServiceConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    ServiceConverter serviceConverter;

    @GetMapping("/getdto")
    public List<User_Dto> findAll()
    {
        List<User> findAll=userRepository.findAll();
        return serviceConverter.entityToDto(findAll);
    }
    @GetMapping("/getentity")
    public List<User> findsAll()
    {
        return userRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public User_Dto findById(@PathVariable(value = "id") int id)
    {
        User user=userRepository.findById(id).orElse(null);
        return serviceConverter.entityToDto(user);
    }

    @PostMapping("/save")
    public User_Dto save(@RequestBody User_Dto dto)
    {
        User user=serviceConverter.DtoToEntity(dto);
        user=userRepository.save(user);
        return serviceConverter.entityToDto(user);
    }

}