# E-commerce System

This is a simple E-commerce system built in Java that allows customers to browse products, add them to their cart, and place an order. The system simulates the interaction between a customer and the e-commerce platform with various product types like electronics, clothing, and books.

## Features

- **Product Catalog**: Includes different types of products such as electronic items, clothing, and books.
- **Shopping Cart**: Allows customers to add multiple products to their cart and calculate the total price.
- **Order Placement**: Customers can place an order or cancel the order before confirmation.
- **User Interaction**: The system takes input from the customer for details like name, address, and the number of products they wish to add.

## Technologies Used

- **Java**: Main programming language used.
- **OOP (Object-Oriented Programming)**: Classes for products (Electronic, Clothing, Book) and customer management.
- **Scanner**: Used for handling user input.

## Project Overview

The system allows a customer to:
1. Enter personal details like ID, name, and address.
2. Browse a catalog of available products.
3. Add selected products to the shopping cart.
4. View the total price of selected items.
5. Confirm or cancel the order.

### Class Structure:
- **Product** (Base class for ElectronicProduct, ClothingProduct, and BookProduct): Represents a product with properties like name, price, and category.
- **Customer**: Stores customer information (ID, name, address).
- **Cart**: Manages the customer's shopping cart, calculates the total price, and places the order.

## How to Run

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/yourusername/ecommercesystem.git
