package com.example.servingwebcontent.web;

import com.example.servingwebcontent.domain.Job;
import com.example.servingwebcontent.domain.User;
import com.example.servingwebcontent.dto.UserDto;
import com.example.servingwebcontent.service.UserService;
import org.mapstruct.Mapping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rest/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public Long save(@RequestBody User user){
        return userService.save(user);
    }

    @PostMapping("/job")
    public void saveJob(@RequestParam long userId, @RequestBody Job job){
        userService.saveJob(userId, job);
    }

    @GetMapping("/{userId}")
    public UserDto get(@PathVariable Long userId){
        return userService.findById(userId);
    }

}
