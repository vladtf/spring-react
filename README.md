# spring-react

An app to store and display images form an AWS S3 database.
This projects uses Spring Boot as backend and React Js as frontend. 

App was made based on Amigoscode tutorial [Spring Security | FULL COURSE](https://www.youtube.com/watch?v=her_7pa0vrg&feature=youtu.be). 

## Running the Application

Import the project to the IDE of your choosing as a Maven project.

Add yout accessKeyId and secretKey from AWS Console Credentials.

Run the application backend using `mvn spring-boot:run` or by running the `Application` class directly from your IDE.
Go to frotend ( in local terminal: `cd src/main/frontend` ) and run frontend `npm start`.

Open http://localhost:3000/ in your browser.

## Test the Application

Drag and drop an image to app and update the page.

To test backend run GET request : http://localhost:8080/api/v1/user ( be sure that profile image link is not null : upload yout own image on every server restart )




