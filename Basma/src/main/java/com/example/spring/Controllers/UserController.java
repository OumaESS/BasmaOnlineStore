package com.example.spring.Controllers;

import com.example.spring.Requests.UserRequest;
import com.example.spring.Responses.UserResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public  String getUser()
    {
        return "gete user";
    }

    @PostMapping
    public UserResponse CreateUsre(@RequestBody UserRequest userRequest)
    {
        return  null;
    }

    @PutMapping
    public  String UpdateUser()
    {
        return  "update user";
    }

    @DeleteMapping
    public String DeleteUser()
    {
        return "delete User";
    }
}
