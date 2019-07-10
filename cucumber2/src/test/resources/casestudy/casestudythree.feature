Feature: login to testmeapp
Scenario Outline: login to testmeapp
Given url of demowebshop "http://10.232.237.143:443/TestMeApp/login.htm"
When alen enter the "<username>" as username
And alen ente the "<password>" as password
And alen click on login button
And alex enter the "<item>" in search bar
And alex click on find item
And alex click on add to chart
And alex click on cart
And alex  click on checkout
And alex click on procced to pay
And alex select bank
And alex click on countiue for pay
And alex enter "<username1>" as username
And alex enter "<password1>" as password
And alex click on login button to enter bankaccount
And alex enter "<transaction>" as transactionpwd
Then alex click on login button for transaction
Examples:
|username|password|item|username1|password1|transaction|
|Lalitha|Password123|Headphone|123457|Pass@457|Trans@457|