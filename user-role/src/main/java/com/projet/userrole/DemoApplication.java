package com.projet.userrole;



import com.projet.userrole.entities.Role;
import com.projet.userrole.entities.User;
import com.projet.userrole.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
@Bean
    CommandLineRunner start (UserService userService){
        return args -> {
            User u2=new User ();
            u2.setUsername("ahmed");
            u2.setPassword ("123456");
            userService.addNewUser (u2);
            User u1=new User ();
            u1.setUsername("akram");
            u1.setPassword ("123456");
            userService.addNewUser (u1);
            Stream.of("STUDENT","USER","ADMIN").forEach(r->{
                Role role1 = new Role();
                role1.setRoleName(r);
                userService.addNewRole(role1);
            });
            userService.addRoleTOUser("akram","STUDENT");
            userService.addRoleTOUser("akram","ADMIN");
            userService.addRoleTOUser("ahmed","USER");
            try {
                User user= userService.authenticate(  "akram", "123456");
                System.out.println(user.getUserId());
                System.out.println(user.getUsername ());
                System.out.println("Roles=>");
                user.getRoles().forEach(r->{
                    System.out.println("Role=>"+r);
                });
            }catch (Exception e){
                e.printStackTrace();
            }

        };
}
}

