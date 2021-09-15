package com.example.demo15.Service;

import com.example.demo15.Model.User;
import com.example.demo15.Model.User_Dto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ServiceConverter
{
    public User_Dto entityToDto(User user)
    {
        User_Dto dto=new User_Dto();
        dto.setId(user.getId());
        dto.setAge(user.getAge());
        dto.setName(user.getName());
        dto.setSal(32000);

        return dto;
    }
    public List<User_Dto> entityToDto(List<User>userList)
    {
        return userList.stream().map(x->entityToDto(x)).collect(Collectors.toList());
    }
    public User DtoToEntity(User_Dto dtos)
    {
        User users=new User();
        users.setAge(dtos.getAge());
        users.setId(dtos.getId());
        users.setName(dtos.getName());
        users.setMail("sabyasachi@gmail.com");

        return users;
    }
    public List<User> DtoToEntity(List<User_Dto> dtos)
    {
        return dtos.stream().map(x->DtoToEntity(x)).collect(Collectors.toList());
    }


}
