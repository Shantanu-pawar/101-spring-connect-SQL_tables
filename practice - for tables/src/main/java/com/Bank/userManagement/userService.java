package com.Bank.userManagement;

import com.Bank.userManagement.Objects.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {

    @Autowired
    userReposatory userReposatory;

    public String createUser(User user){
        userReposatory.save(user);
        return "user Created successfully;";
    }

    public User getUser(int id){
        User user = userReposatory.findById(id).get();
        return user;
    }

    public String updateUser(int id){

        
        return "updated successfully";
    }
}
