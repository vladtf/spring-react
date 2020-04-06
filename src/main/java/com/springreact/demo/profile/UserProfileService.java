package com.springreact.demo.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileService {

    private final UserProfileDataAccessService dataAccessService;

    @Autowired
    public UserProfileService(UserProfileDataAccessService dataAccessService) {
        this.dataAccessService = dataAccessService;
    }

    public List<UserProfile> getUserProfiles(){
        return  dataAccessService.getUserProfiles();
    }
}
