import React, {useEffect} from 'react';
import './App.css';
import axios from "axios";

const UserProfiles = () => {
    const fetchUserProfile = () => {
        axios.get("http://localhost:8080/magement/api/v1/user").then(res => {
            console.log(res);
        });
    };

    useEffect(() => {
        fetchUserProfile();
    }, []);

    return <h1>Hello</h1>
};


function App() {
    return (
        <div className="App">
            <UserProfiles/>
        </div>
    );
}

export default App;
