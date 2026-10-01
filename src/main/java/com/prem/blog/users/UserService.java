package com.prem.blog.users;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    // write here business logic

    // inject te dependency of userRepository
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public Mono<User> create(User userReq){
        return userRepository.save(userReq);
    }

}
