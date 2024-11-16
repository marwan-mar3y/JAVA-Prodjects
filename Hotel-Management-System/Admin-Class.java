/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelmain;

class Admin {
    private String username = "safwa";
    private int password = 1234;

    public boolean login(String enteredUsername, int enteredPassword) {
        return enteredUsername.equals(username) && enteredPassword == password;
    }
}
