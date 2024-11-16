/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelmain;

import java.util.Scanner;
class Customer {
    private String name;
    private String bookedRoom;
    private int nights;
    private int totalCost;

    public Customer(String name) {
        this.name = name;
    }

    public void bookRoom(String roomNumber, Scanner input) {
        bookedRoom = roomNumber;
        nights = nights(input);
        totalCost = receipt();
    }

    public void listBookings() {
        if (bookedRoom != null) {
            System.out.println("Your Booking: Room " + bookedRoom + " booked by " + name);
        } else {
            System.out.println("You have not made any bookings yet.");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int getNights() {
        return nights;
    }

    public int getReceipt() {
        return totalCost;
    }

    private int nights(Scanner input) {
        System.out.print("Enter the number of nights: ");
        return input.nextInt();
    }

    private int receipt() {
        
        return nights * 100;
    }
}
