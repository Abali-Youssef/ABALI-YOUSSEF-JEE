package com.projet.userrole.Web;

import com.projet.userrole.entities.User;
import com.projet.userrole.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @Autowired
    private UserService userService;
    @GetMapping("/user/{username}")
    public User user(@PathVariable String username){
return userService.findUserByUserName(username);
    }
}
