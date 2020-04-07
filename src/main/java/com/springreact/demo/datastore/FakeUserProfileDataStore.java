package com.springreact.demo.datastore;

import com.springreact.demo.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("b8725fc8-4f61-41d3-80b6-deca5dea5f58"), "janet", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("1c731c1a-81f7-4c1d-8edf-c7c878021255"), "linda", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("4fa81bf0-15a8-4cd8-8e34-b21ffdf47333"), "tom", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
