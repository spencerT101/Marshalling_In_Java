Personal project, orginally from a take home assignment, to marshall an XMl file input into a JSON out put through a restAPI route.

# MVP
- Verify that the requester has provided the correct basic Auth details:
  Username: admin
  Password: password
- Accept an incoming payload of an XML document and verify that the XML is valid using the supplied schema.
- Be able to return the response as either XML or JSON with a 201 response code.
- Use a query param to determine how the user chooses the response format.
- Update the Cost of each PurchaseOrderLine such that the new Cost is equal to the current Cost * 1.23.
- Return a 404 response if the API is called with a URL that does not match the expected URLs for getting XML/JSON and provide the body seen in sample404ErrorOutput.json.
- Write unit tests with useful function names.

The final solution satisfies each MVP requirement.

# Screenshots

<br>

### Class Diagram

<img width="800" alt="Screenshot 2022-01-24 at 23 30 26" src="https://user-images.githubusercontent.com/48687748/150882482-6104d615-0ed9-4efd-96fb-b287ff5f72b4.png">

<br>
<br>
<br>

### 201 Created - Successfully authenticated, validated, unmarshalled XML input to JSON output using query parameter +  with cost * 1.23  

<img width="800" alt="Screenshot 2022-01-24 at 23 03 45" src="https://user-images.githubusercontent.com/48687748/150879603-1714e9dc-03a2-4d60-90d9-2ebe8814a900.png">

<br>
<br>
<br>

### 500 Internal Server Error - Schema validation error

<img width="800" alt="Screenshot 2022-01-24 at 23 07 04" src="https://user-images.githubusercontent.com/48687748/150879996-721e6a5d-435a-4669-a47f-86f1db9be2c0.png">

<br>
<br>
<br>

### 404 Not Found - Custom error message

<img width="800" alt="Screenshot 2022-01-24 at 23 23 14" src="https://user-images.githubusercontent.com/48687748/150881733-5cded31c-7c8f-4b96-aed3-62c2bdb38ddf.png">

<br>
<br>
<br>

### 401 Unauthorised - Incorrect username and password

<img width="800" alt="Screenshot 2022-01-24 at 23 27 14" src="https://user-images.githubusercontent.com/48687748/150882171-65ad3851-d2df-4149-9418-583f0b3f2ded.png">

<br>
<br>
<br>

## Installation and set up...

- Clone the repository and open in your chosen IDE.
- In your chosen API client create a POST request.
- Set url to localhost:8080/order/"query-parameter" select either "order/json" or "order/xml" for query parameter.
- In the resources folder look for "sampleInput.xml" file and copy contents into body of the POST request.
- Set authentication type to BASIC AUTH : 
  <br>
  Username: admin 
  <br>
  Password: password
  <br>
- In your IDE run the service and send the POST request.
- For reference, schema.xsd and sample404ErrorOutput.json files can be found in resources folder.

<br>

## Dependencies/Libraries/Packages/Languages

- Spring Web
- Spring Boot Dev Tools
- Spring Data JPA
- Spring Boot Starter Security
- Java
- SAX
- JAXB
- IOException
- Maven
- Junit

