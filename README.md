# HCL_RestAPI
Steps to Execute 
1. Open the code in IntelliJ Idea editor
2. Install Java and Maven dependencies
3. Execute the command mvn spring-boot:run in terminal
4. The application will start on localhost:8080
5. Open Postman tool
6. Execute POST url localhost:8080/api/customers
   Pass below mentioned JSON file in Body -->Raw --> Selecting JSON in Dropdown
   {
     "name":"Ravi",
     "age": 29,
     "location":"India"
   }
   Then Click on Send to craete database
7.Execute POST url localhost:8080/api/customers
   Pass below mentioned JSON file in Body -->Raw --> Selecting JSON in Dropdown
   {
     "name":"shankar",
     "age": 29,
     "location":"Germany"
   }
   Then Click on Send to craete database
 8.Execute GET url localhost:8080/api/customers/{ID}
 Note: Mention whereever ID is required
 9. Execute PUT url localhost:8080/api/customers
   Pass below mentioned JSON file in Body -->Raw --> Selecting JSON in Dropdown
   {
     "name":"shankar",
     "age": 29,
     "location":"India"
   }
   This will add a new ID to database 
  10.Execute DELETE url localhost:8080/api/customers/2
  This will give response of 204 No content as we have Override ID 2 with ID 3 by updating location.
  
