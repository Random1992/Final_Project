<p align="center">
    <img src="https://images.pexels.com/photos/128756/pexels-photo-128756.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260">
</p>

# FISHBOOK
A social network for BUSINESS people who love FISH! 

## Contents
 * [Overview](#Overview)
 * [Features](#Features)
 * [Design](#Design)
 * [Implement](#Implement)

## <a name="Overview">Overview</a>
 * **Overview of Service:** FISHBOOK is a web application for people 
 who love keeping fish to communicate with each other.
 * **Target User:** BUSINESS people like programmers who love pets but have little time
  to keep dogs or cats. Keeping fish can help them relieve their pressure.
 * **Why Fish?** Fishes are cheep (^_^)! And keeping fish is less time-consuming.
 * **Just like Programming!** Decorating the aquarium for the fishes is
 just like programming. It is fun and programmers will love it (^_^)!
 
 ## <a name="Features">Features</a>
 * Users can post pictures of their aquariums and fishes
 * Users can send message to other user
 * Users can add friends
 * Users can sale and buy fishes from other user
 * Users can join different group and talk about how to keep fish
 
 ## <a name="Design">Design</a>

###Functionality
 - Due to the time limit, only part of the features will be implemented. 
 The target features for this final project include:
     - [ ] [User Login and Logout](#login)
     - [ ] [Security features for user login](#security)
     - [ ] [Users can post their pictures](#post)
     - [ ] [Users can search other users' profiles](#search)
     - [ ] [Logging/Monitoring](#logmonitor)
###Design of the application's framework
- The Framework/Tools I plan to use for the Frontend, Backend
and the Database are listed bellow: 
    - Frontend
        - HTML/CSS
        - JavaScript
    - Backend
        - SpringBoot
    - DataBase
        - MySQL
###Infrastructure
- Amazon Web Services (AWS)
    - Two public EC2 Instances
    - Two Private EC2 Instances

![image](https://github.com/Random1992/Final_Project/blob/master/fishbook/src/main/resources/static/img/Infrastructure.png)

###DataBase
- Data Schema

![image](https://github.com/Random1992/Final_Project/blob/master/fishbook/src/main/resources/static/img/DatabaseSchema.png)

##<a name="Implement">Implement</a>
###<a name="login">User Login Page</a>

```java
public interface userLogin{
    /**
    * 
    * @param userID
    * @param loginPwd
    * @return "Login Succeed" or "Login Failed"
    */
    String ulogin(String userID, String loginPwd);
    /**
    *  
    * @return "Logout Succeed"
    */
    String ulogout();
}
```

###<a name="security">Security</a>


###<a name="post">Post Function</a>

