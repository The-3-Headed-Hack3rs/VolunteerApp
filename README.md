# VolunteerApp

Group Project - README Template
===

# 

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
The application is used to project the possible need for volunteers in the Huntsville area. The user will create an account that will allow them to choose an area and what kind of volunteer work they would like to do. 

### App Evaluation
[Evaluation of your app across the following attributes]
- **Category:** Networking/ Volunteer 
- **Mobile:** This application will be used only on a mobile device, it will be somewhat similiar to Yelp but instead you will be able to find local volunteer help.
- **Story:** Show a list of different volunteer options in the selected area of the user. The user is able to select which event he/she would like the participate in.
- **Market:** Any person can choose which volunteer work is best for them. 
- **Habit:** Can be used at anytime of the day where volunteer is needed. 
- **Scope:** We will connect a user to whateva volunteer work that suits them. They will have the option to refine there options so they can find the best volunteer for them . 

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-Have Stories**

* User can register new account [x]
* User can login[X]
* User Select location[x] 
* User can view the feed[x] 

**Optional Nice-to-Have Stories**

* Help page[] 
* User can see their profile page with their photos[]
* Can save its favorites for later[] 

### 2. Screen Archetypes

* Create screen 
   * New user account
* Login screen 
   * User can login
* Home screen 
    * User can see list of areas volunteer is needed 
    * User can see details about each volunteer event 
    * User can click on icon to favorite it
* Favorite screen 
    * User can see all the favorite event for later 

* Confirmation Screen 
    * User can view confirmed event 

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Home feed 
* Map Search 
* Saved for later 

**Flow Navigation** (Screen to Screen)

* Login Screen 
   * Home screen 
   * Create new page
* Home Screen 
   * Home
   * Detail page 

* Confirmation Screen
    * Go back to Home screen after


## Wireframes
![image0](https://user-images.githubusercontent.com/32345648/76821172-24231880-67db-11ea-98b5-ca9af163cbe2.jpeg)

### [BONUS] Digital Wireframes & Mockups

### [BONUS] Interactive Prototype

## Schema 
[This section will be completed in Unit 9]
### Models
|Property|	Type | 	Description |
|--------| ------|--------------|
|ObjectId|	String|	ID for user| 
|UpdateAt 	|Date Time	|Date for update|
|CreateAt	|Date Time	|Date for create|
|Details	|String	| Information about event|
|Location	|ADT	 |Maps of volunteer area available|
|Refine	|String	|Chose which character you are looking for| 

### Networking

Networking (request by screen) 
* Home screen
  *	(read) User should be able to see post 
  *	(select) Chose which event you want to attend
  *	(favorite) save an event for later 
* Refine screen 
	* (edit) edit the area 
  *	(select) chose your preference 
  *	(select) hours you would like to work 
* Save for later screen 
  * (delete) delete the no longer want to save 
  *	(select) can go back an chose the event 
* Profile screen 
  * (read/GET) Query logged in user object 
  * (update/PUT) update user profile image 

- [Add list of network requests by screen ]
- [Create basic snippets for each Parse network request]
- [OPTIONAL: List endpoints if using existing API such as Yel

## Milestone
Unit 11 In this sprint we will create a screen that the user can register new account. Well have text fields first name, last name, email, password and area code. There will also be a create new account link that will reroute back to the create new account screen and a submit button. Connect a database to the project.
![VolunteerAppGifLogin](https://user-images.githubusercontent.com/32345648/81116892-c7470300-8eeb-11ea-95f5-5f78baca4a63.gif)
![VolunteerAppGifCNA](https://user-images.githubusercontent.com/32345648/81117049-0ffebc00-8eec-11ea-94a4-4ac4658b1e0c.gif)

Unit 12 We will able to connect to a Parse database that will hold new user information. We will also create a home screen that with have images of different places and and location that volunteer is needed. the user will be able to see this Home screen and be able to scroll and refresh the page.The user can also turn their phone vertical and horizontal. Kadejah- create the database Justin- look up different volunteer needed in the area Greg- create the homepage and favorite page.

Unit 13 Make confirmation page and Wrap up. Test app, make sure there is no errors, have a walk-through video ready. Prepare for demo day

![VolunteerAppGifconfirmation](https://user-images.githubusercontent.com/32345648/81117056-142ad980-8eec-11ea-9b19-27be02b61056.gif)



