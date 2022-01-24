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

![marshalling-service-class-diagram](https://user-images.githubusercontent.com/48687748/150876883-9363861f-e560-45cf-864e-0c53b7cd455c.png)

<br>
<br>
<br>

### 201 Created - Successfully unmarshalled XML input to JSON output using query parameter +  with cost * 1.23  

<img width="800" alt="Screenshot 2022-01-24 at 23 03 45" src="https://user-images.githubusercontent.com/48687748/150879603-1714e9dc-03a2-4d60-90d9-2ebe8814a900.png">

<br>
<br>
<br>

### 500 Internal Server Error - Schema validation error

<img width="800" alt="Screenshot 2022-01-24 at 23 07 04" src="https://user-images.githubusercontent.com/48687748/150879996-721e6a5d-435a-4669-a47f-86f1db9be2c0.png">
