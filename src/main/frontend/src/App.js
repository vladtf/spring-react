import React, {useEffect, useState} from 'react';
import './App.css';
import axios from "axios";

const UserProfiles = () => {

    const [userProfiles, setUserProfiles] = useState([]);

    const fetchUserProfile = () => {
        axios.get("http://localhost:8080/api/v1/user").then(res => {
            console.log(res);
            setUserProfiles(res.data);
        });
    };

    useEffect(() => {
        fetchUserProfile();
    }, []);

    return userProfiles.map((userProfile, index) => {

        return (
            <div key={index}>
                <h1>{userProfile.username}</h1>
                <p>{userProfile.userProfileId}</p>
            </div>
        )
    })
};


function App() {
    return (
        <div className="App">
            <UserProfiles/>
        </div>
    );
}

export default App;
