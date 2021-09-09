package com.example.demo15.Service;

import com.example.demo15.Model.User;
import com.example.demo15.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{
    @Autowired
    UserRepository userRepository;


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(int id) {
        User user1 = userRepository.findById(id).get();
//    .orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
//
//        User.setTitle(UserRequest.getTitle());
//        User.setDescription(UserRequest.getDescription());
//        User.setContent(UserRequest.getContent());
//        return userRepository.save(user1);
        return user1;
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

//    @Override
//    public User getUserById(long id) {
//        Optional<User> result = UserRepository.findById(id);
//        if(result.isPresent()) {
//            return result.get();
//        }else {
//            throw new ResourceNotFoundException("User", "id", id);
//        }

//		User User = UserRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
        //return User;
    }
