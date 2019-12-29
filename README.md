# Introduction to HTTP

Welcome to the **HTTP** module!

During this module you will learn about HTTP, the protocol that is the foundation of data communication for the World Wide Web. <br>
You will be able to understand how information is transferred between a client and a server and how different applications interact over the internet.


Some of the key topics that are going to be explained during this module are:
- Basics of HTTP, TCP/IP, DNS, URL, URI
- Commands, Status Codes, Headers, Forwarding

and you will be introduced to tools like:
- curl, 
- wget, 
- ping, 
- telnet, 
- ssh, 
- wireshark, 
- postman

## Presentation
Presentation is available under [this link](https://gitlab.com/sda-international/program/java/15-http/wikis/uploads/5b1bcf706491336b1b0856da954e308d/13_HTTP.pdf)

## Project setup
Steps:
1. Clone the repository on your laptop and import it in IntelliJ.
2. Configure the database configuration - file ```application.properties```.
3. Run the method ```main``` from ```Application.java```.

### Examples
Note: curl is available in git bash terminal.
1. Get all cars: ```curl localhost:8080/api/cars```
2. Create a car: ```curl -X POST -H "content-type: application/json" -d "{\"brand\": \"Ford\", \"model\":\"Focus\", \"engine\": \"2.0\", \"color\": \"black\"}" -k localhost:8080/api/cars```
3. Update a car: ```curl -X PUT -H "content-type: application/json" -d "{\"brand\": \"Ford\", \"model\":\"Fiesta\", \"engine\": \"1.6\", \"color\": \"black\"}" -k localhost:8080/api/cars/1```
4. Delete a car: ```curl -X DELETE -k localhost:8080/api/cars/1```


### Exercises
1. Using cURL and the API provided, call the GET method (/api/cars)
2. Calling the POST method, add a new car (/api/cars). Check what GET returns.
3. Calling the PUT method, modify the data of the added car (/api/cars/{id}). Check what
   GET returns.
4. Calling the DELETE method (/api/cars/{id}). Check what GET returns.

## Examples using tools
Open git bash and run the following commands:
1. ```ssh bandit0@bandit.labs.overthewire.org -p 2220```. Use password *bandit0*. Now you are connected to a remote server via ssh. Type *exit* to terminate the ssh connection.
    If you are interested to continue the game click [here](https://overthewire.org/wargames/bandit/bandit0.html).
2. ```ping www.google.com```.
3. ```wget -O wordpress.zip https://wordpress.org/latest.zip``` - download the resource.

## REST with JSON
The following [website](https://jsonplaceholder.typicode.com/) provides several endpoints to exercise the CRUD operations on several
resources.

**Use ```-v``` parameter for curl command if you want to see the verbose output**.

**Examples**
1. Get all posts: ``` curl -X GET https://jsonplaceholder.typicode.com/posts```
2. Get post with id 1: ``` curl -X GET https://jsonplaceholder.typicode.com/posts/1```
3. Get all comments from post with id 1: ``` curl -X GET https://jsonplaceholder.typicode.com/posts/comments```
4. Delete a post: ```curl -X GET https://jsonplaceholder.typicode.com/posts/1```
Important: the resource will not be really deleted on the server but it will be faked as if.
5. Create a post: ```curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X POST --data '{ "title":"test1", "body":"body test1","userId":1}' https://jsonplaceholder.typicode.com/posts```
<br/>Important: the resource will not be really created on the server but it will be faked as if.
<br/>If you try to get the created post you will get a 404 response status:
```curl -v -X GET https://jsonplaceholder.typicode.com/posts/101```
<br/> In the output look for ```HTTP/2 404```.
6. Update a post: ``` curl -v -i -H "Accept: application/json" -H "Content-Type: application/json" -X PUT --data '{ "title":"test1", "body":"body test1","userId":1}' https://jsonplaceholder.typicode.com/posts/1```
<br/>Important: the resource will not be really updated on the server but it will be faked as if.

**Exercises**

As shown in the above examples, use GET, DELETE, POST, PUT for the following resources:
1. ```https://jsonplaceholder.typicode.com/albums```
2. ```https://jsonplaceholder.typicode.com/users```
3. ```https://jsonplaceholder.typicode.com/photos```

# Further reading
**Colorful and detailed explanation of how dns works** https://howdns.works/.

## Books

1. Introduction to Networking: How the Internet Works
2. Computer Networks 5th Edition

## Links

1. https://www.tutorialspoint.com/http/index.htm
2. https://do1.dr-chuck.net/net-intro/EN_us/net-intro.pdf
3. http://intronetworks.cs.luc.edu/current/ComputerNetworks.pdf