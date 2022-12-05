End Points:
Eureka discovery Ws: http://localhost:8010/
Account Ws :http://localhost:9082/account/status/check



User Ws End Points:
User Creation:http://localhost:8082/users-ws/users 
User Login:http://localhost:8082/users-ws/users/login 
User Status Check:http://localhost:8082/users-ws/users/status/check

#Once User created in the system and user is authenticated then JWT token will create.
#By Using JWT token user can do any tranasction 
#In this project User can check status by using valid token generated .
#H2 in Memory DB used for theis requirement
#Token Will be Expired afer 1 min
# Refresh Token Has not Implemented
#Every time application Stop/Start records will removed from Memory since we are using H2 in Memory DB

Testing Steps:
First Run PhotoAppDiscoveryService Ws
Second Run PhotoAppApiUsers Ws
Third Run ApiGateWay Ws
Create User-Login User-Token Will Generate-Using that vtoken we can check the Status of User

Json format for Testing
Ex:
Create:
{
"firstName":"ss",
"lastName":"Biswal",
"password":"87654321",
"email":"sstest@test.com"
}
Login:
{
"email":"sstest@test.com",
"password":"87654321"
}
