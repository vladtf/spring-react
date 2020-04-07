package com.springreact.demo.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Service
public class UserProfileService {

    private final UserProfileDataAccessService dataAccessService;

    @Autowired
    public UserProfileService(UserProfileDataAccessService dataAccessService) {
        this.dataAccessService = dataAccessService;
    }

    public List<UserProfile> getUserProfiles() {
        return dataAccessService.getUserProfiles();
    }

    public void uploadUserProfileImage(UUID userProfileId, MultipartFile file) {
        // 1. Check if image is not empty
        // 2. If file is an image
        // 3. Whether the user exists in database
        // 4. Grab some metadata from file if any
        // 5. Store the image in S3 and update database (userProfileImageLing) with s3 image link
    }
}
