# intive-fdv-java-test

# Technology stack

![](https://img.shields.io/badge/java-✓-blue.svg)
![](https://img.shields.io/badge/maven-✓-blue.svg)
![](https://img.shields.io/badge/junit-✓-blue.svg)
![](https://img.shields.io/badge/jacoco-✓-blue.svg)

# Design

To model the different rental options, I decided to use the composite pattern, this is a structural pattern that lets clients treat individual objects and compositions of objects uniformly.
I made this desicion based on the premise that exists concrete rental options as hour rental or week rental that knows how to calculate their own rental value, and composed option like family rental that are a composed of concrete options, that calculate their rental value based on the options that are composed.

This solution provide an easy posibility to add new concrete or composed rental options in the future, to do this it is only needed to implement the interface Rental.

You can found the Rental interface and the different implementations under the composite package.

Also a factory pattern was applied to create the different rental options instances, this is a creational pattern that provide the functionality to create different instances of a family of objects based on an input. I made this desition to provide a mechanism to the client to work only against Rental interface, so the client doesn´t need to worry of instanciate a concrete implementation of the Rental interface.

The result of this is a mechanism that allows to change the diferents implementations of the Rental interface used for the diferents options whitout any impact to the client.

You can found the factory implementation under the factory package.

# Developed practices

I follow the principle of program against interfaces, this principle provides great advantages like small coupling between classes or layers in the program. For example in the solution described above when a client use the factory to obtain a Rental he is not going to be coupled to a concrete implementation, this provides a flexible way to change the behavior of the application. As a consequence, if in the future exists other structures treated as rentals, this will be very easy to be added. This is why this principle provides a great way to extend and grow the solution of the problem in a healthy way.

To test the correct behavior of the solution I created unit tests for each of the classes of the project, each of this test classes contains a set of test that ensure that each method of the class works as expected. You can found the tests under the test package.

# How to run the tests

This project is built under Maven, so to run the tests you need to have maven installed. If you don´t have it installed you can do it following the instructions in this [link](https://maven.apache.org/install.html)

## Steps to run the tests

1. Clone the repo
2. Navigate to the root folder of the cloned repo (intive-fdv-java-test) in your local machine
3. Using a terminal run the command `mvn clean test`
4. Check the report generated in `intive-fdv-java-test/target/site/jacoco/index.html`