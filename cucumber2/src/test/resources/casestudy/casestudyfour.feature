Feature: addtocart button
Scenario: addtocart button
Given url of TestMeApp "http://10.232.237.143:443/TestMeApp/login.htm"
When ali enter the "lalitha" as username
And ali ente the "Password123" as password
And ali click on login button
And ali enter the "Headphone" in search bar
And ali click on find item
Then ali check cart option is available or not