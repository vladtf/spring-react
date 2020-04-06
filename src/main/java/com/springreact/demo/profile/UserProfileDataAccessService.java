package com.springreact.demo.profile;

import com.springreact.demo.datastore.FakeUserProfileDataStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessService {

    private final FakeUserProfileDataStore dataStore;

    @Autowired
    public UserProfileDataAccessService(FakeUserProfileDataStore dataStore) {
        this.dataStore = dataStore;
    }

    public List<UserProfile> getUserProfiles() {
        return dataStore.getUserProfiles();
    }
}
