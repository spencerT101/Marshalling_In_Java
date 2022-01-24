Personal project, orginally from a take home assignment, to marshall an XMl file input into a JSON out put through a restAPI route.

#MVP
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

#Screenshots



