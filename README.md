# Net-A-Porter Shop Technical Exercise
You have been given a partially implemented online shopping application. We
would like you to finish the implementation to provide some basic
shopping features. This exercise is an opportunity to demonstrate your
development skills. We're looking for clean, well-tested and easy to
understand code.

## Running the Application
The Shop has been implemented as a command-line application. The main
method is in Application.java. The application uses Maven and can be run
with the command:

```mvn clean compile exec:java```

When running, the Application will shows a list of options,
Application.java has been implemented to read the input and invoke the
appropriate partially implemented method.

We would like you to finish the application be completing the following
scenarios.


## Exercises
### Exercise 1 - Loading and listing Products
We have provided a data file of Product information. In Exercise 1 you
need too:

1. Parse the `product-data.csv` file to read the product data.
2. Implement the "list" action to show which products can be purchased.


### Exercise 2 - Basic basket functionality
In this exercise you build on what you've done in Exercise 1. We would
like you to implement some basic features of a Shopping Basket.

1. Implement the ability to add a product to the basket.
2. Implement the ability to remove a product from the basket.
3. Implement the ability to get the total value of the basket.


### Notes
The application has been created without any specific JDK or Libraries.
If you wish, you have total freedom to use any JDK version or libraries
to help you complete the exercises, just update the pom.xml file.
