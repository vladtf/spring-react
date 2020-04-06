package com.springreact.demo.profile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserProfileController {



    @GetMapping
    public List<UserProfile> getUserProfiles(){
        return null;
    }
}
