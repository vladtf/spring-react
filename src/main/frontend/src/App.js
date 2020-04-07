import React, {useCallback, useEffect, useState} from 'react';
import './App.css';
import axios from "axios";
import {useDropzone} from 'react-dropzone'

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
                <MyDropzone/>
                <h1>{userProfile.username}</h1>
                <p>{userProfile.userProfileId}</p>
            </div>
        )
    })
};

function MyDropzone() {
    const onDrop = useCallback(acceptedFiles => {
        // Do something with the files
    }, [])
    const {getRootProps, getInputProps, isDragActive} = useDropzone({onDrop})

    return (
        <div {...getRootProps()}>
            <input {...getInputProps()} />
            {
                isDragActive ?
                    <p>Drop the files here ...</p> :
                    <p>Drag 'n' drop some files here, or click to select files</p>
            }
        </div>
    )
}


function App() {
    return (
        <div className="App">
            <UserProfiles/>
        </div>
    );
}

export default App;
