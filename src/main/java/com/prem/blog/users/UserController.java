package com.prem.blog.users;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/blogs")
public class UserController {
    //this file is only for rest api//

    // inject te dependency of userService
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/sign-up")
    public Mono<ResponseEntity<User>> signUp(@RequestBody User userReq){
        return userService.create(userReq).map(response -> ResponseEntity.status(HttpStatus.CREATED).body(response));
    }
}
