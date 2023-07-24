package com.Bank.userManagement.ControllerLayer;

import com.Bank.userManagement.Objects.User;
import com.Bank.userManagement.Objects.libraryCard;
import com.Bank.userManagement.userReposatory;
import com.Bank.userManagement.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/user")
public class userController {

    @Autowired
    com.Bank.userManagement.userService userService;

    @Autowired
    com.Bank.userManagement.userReposatory userReposatory;

    @PostMapping("/post")
    public String createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/get")
    public User getUser(@RequestParam("id") int rollNo) {
        return userService.getUser(rollNo);
    }


}
