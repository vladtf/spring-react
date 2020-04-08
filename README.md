# spring-react

An app to store and display images from an AWS S3 database.

This project uses Spring Boot as backend and React Js as frontend. 

App was made based on Amigoscode tutorial : [Spring Boot and React JS | Full Course | 2020](https://www.youtube.com/watch?v=i-hoSg8iRG0&t=). 

## Running the Application

Open the project in IDE.

Add your accessKeyId and secretKey from AWS Console Credentials.

Run the application backend using `mvn spring-boot:run` or by running the `Main` class directly from your IDE.
Go to frotend ( open terminal in frontend folder: `cd src/main/frontend` ) and run frontend using `npm start`.

Open http://localhost:3000/ in your browser.

## Test the Application

Drag and drop an image to app and update the page.

To test backend run GET request : http://localhost:8080/api/v1/user ( be sure that profile image link is not null : upload your own image on every server restart )




