# inheritance
we are Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars betweeen 0 and 5, and a price category (i.e. number of dollar signs).<br />
Implement a Restaurant constructor.<br />
Test that your Restaurant constructor is behaving reasonably.<br />
Implement a reasonable toString method for Restaurants.<br />
Write a test to create an instance of Restaurant and ensure that its toString is working properly.<br />
we while Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.<br />
Write a Review constructor.<br />
Test that your constructor is working reasonably.<br />
Implement a reasonable toString method for Reviews.<br />
create a test  an instance of Review and ensure that its toString is working properly.<br />

Add an instance method addReview to your Restaurant class. This method should take in a Review instance, and associate that review with this Restaurant. The specific methodology for this will vary, depending on the implementation you chose above.<br />
Add tests to ensure that when you call addReview, the association is created between the Restaurant and the Review.<br />
When you associate a review with a restaurant, that restaurant’s star rating should change.<br />
Ensure that your addReview method updates the Restaurant star rating appropriately, and add tests. <br />
note:(In particular, ensure that if you’re trying to call addReview when the restaurant and the review are already associated, the star rating of the restaurant does not update.)<br />