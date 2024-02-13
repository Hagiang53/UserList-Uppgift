# User Management Console Application

This is a simple console application written in Java for managing a list of users. It demonstrates the use of object-oriented principles and data structures.

## Features

- Create, retrieve, and remove users
- Search for users by ID
- Sort users by name

## How to run the code

1. Pull the code from Github
2. Open the project in Intellij IDEA
3. Run `main` class to execute the application.

## Project structure

### `Main.java`

This file is the entry point and will call the database to manage users

Here is where all user input / output is done.
Once the application is running, you can interact with it through the console with the available commands:

- `add <id> <name> <email>`: Add a new user with the specified ID, name, and email.
- `remove <id>`: Remove the user with the specified ID.
- `get <id>`: Retrieve the user with the specified ID.
- `search <id>`: Search for a user by ID.
- `sort`: Sort users by name.
- `exit`: Exit the application.

### `UserList.java`

This file creates and connects to the database to sort users.

### `User.java`

This is the class for users.


## Clean code

This code demonstrates using clean code by having descriptive method names such as
