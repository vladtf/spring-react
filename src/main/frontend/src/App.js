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
                {userProfile.userProfileId ?
                    <img src={`http://localhost:8080/api/v1/user/${userProfile.userProfileId}/image/download`}/> : null}
                <br/>
                <br/>
                <h1>{userProfile.username}</h1>
                <p>{userProfile.userProfileId}</p>
                <MyDropzone userProfileId={userProfile.userProfileId}/>
                <br/>
            </div>
        )
    })
};

function MyDropzone({userProfileId}) {
    const onDrop = useCallback(acceptedFiles => {
        const file = acceptedFiles[0];

        console.log(file);

        const formData = new FormData();
        formData.append("file", file);

        axios.post(`http://localhost:8080/api/v1/user/${userProfileId}/image/upload`,
            formData,
            {
                headers: {
                    "Content-Type": "multipart/form-data"
                }
            }
        ).then(() => {
            console.log("File uploaded successfully")
        }).catch(err => {
            console.log(err);
        });

    }, [])
    const {getRootProps, getInputProps, isDragActive} = useDropzone({onDrop})

    return (
        <div {...getRootProps()}>
            <input {...getInputProps()} />
            {
                isDragActive ?
                    <p>Drop the image ...</p> :
                    <p>Drag 'n' drop profile image, or click to select profile image</p>
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
