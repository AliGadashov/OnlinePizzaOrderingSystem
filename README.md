# Online Pizza Ordering System

## Overview
The Online Pizza Ordering System is a backend-only Java application that handles pizza orders through a command-line interface. This simplified system streamlines the pizza ordering process and includes basic features for user authentication, menu browsing, order placement, and order history. The application uses Lists for in-memory storage of user accounts, menu details, and order history.

## Features
- **User Authentication:**
  - Users can register as customers and place orders.
  - Admins have global access to customer data, order history, and can manage couriers.

- **Menu Browsing:**
  - Users can view the menu, select pizzas, and customize toppings according to their preferences.

- **Order Placement:**
  - A straightforward process for users to place orders with selected pizzas and toppings.

- **Order History:**
  - Users can view their order history for reference.

- **Admin Functionality:**
  - **Admin Login:**
    - Admins can log in using global credentials.
    - Two options upon login: Admin Mode or Customer Mode.
    
  - **Admin Mode:**
    - Access to global customer data, order history, and courier management.
    - Ability to add new couriers.

  - **Customer Mode:**
    - Customers can register and place orders.

## Technologies Used
- Java for backend logic.
- Lists for in-memory storage of user accounts, menu details, orders, couriers, and admin data.

## Setup Instructions
1. Clone the repository to your local machine:

```bash
git clone https://github.com/AliGadashov/OnlinePizzaOrderingSystem.git
