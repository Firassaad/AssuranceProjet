package com.example.demo.Controller;

import com.example.demo.Entities.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;

@CrossOrigin("*")
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    private static int idUserConnecte;

    public static int getIdUserConnecte() {
        return idUserConnecte;
    }

    @PostMapping("/user/save")
    public User AddUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/user/getAll")
    public List<User> GetAll() {
        return userRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(User u) {
        userRepository.delete(u);

    }

    @GetMapping("/user/login/{login}/{pwd}")
    public boolean Login(@PathVariable(value = "login") String login, @PathVariable(value = "pwd") String pwd) {
        List<User> l = userRepository.findAll();
        for (int i = 0; i < l.size(); i++)
            if (l.get(i).getLogin().equals(login) && l.get(i).getPassword().equals(pwd)) {
                return true;
            }
        return false;
    }

    @GetMapping("/user/getUserLogged/{login}/{pwd}")
    public Long getIdUserConnecté(@PathVariable(value = "login") String login , @PathVariable(value = "pwd") String pwd) {
        List<User> l = userRepository.findAll();
        Long id=Long.valueOf(-1);

        for(int i=0;i<l.size();i++)
        {
            User u=(User) l.get(i);
            if((u.getLogin().equals(login))&&(u.getPassword().equals(pwd)))
            {
                id = u.getId();
            }

        }

        return id;

    }

}
