package com.example.demo15.Controller;

import com.example.demo15.Model.User;
import com.example.demo15.Model.User_Dto;
import com.example.demo15.Service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public List<User_Dto> getAllUsers() {

        return userService.getAllUsers().stream().map(User -> modelMapper.map(User,User_Dto.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/get/{id}")
    public User_Dto getUserById(@PathVariable(name = "id") int id) {
        User user = userService.getUserById(id);

        // convert entity to DTO
        User_Dto user_dto = modelMapper.map(user,User_Dto.class);

        return user_dto;
    }

    @PostMapping("/post2")
    public User_Dto createUser(@RequestBody User_Dto user_dto) {

        // convert DTO to entity
        User userRequest = modelMapper.map(user_dto,User.class);

        User user = userService.createUser(userRequest);

        // convert entity to DTO
        User_Dto UserResponse = modelMapper.map(user, User_Dto.class);

        return UserResponse;
    }
    // change the request for DTO
    // change the response for DTO
//    @PutMapping("/{id}")
//    public ResponseEntity<User_Dto> updateUser(@PathVariable long id, @RequestBody User_Dto User_Dto) {
//
//        // convert DTO to Entity
//        User userRequest = modelMapper.map(User_Dto, User.class);
//
//        User user = userService.updateUser(id, UserRequest);
//
//        // entity to DTO
//        User_Dto UserResponse = modelMapper.map(User, User_Dto.class);
//
//        return ResponseEntity.ok().body(UserResponse);
//    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable(name = "id") int id) {
        userService.deleteUser(id);
//        ApiResponse apiResponse = new ApiResponse(Boolean.TRUE, "User deleted successfully", HttpStatus.OK);
//        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }
}