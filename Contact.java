/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

public class Contact {
    private String name;
    private String phone;
    
    public Contact(String name, String phone){
        this.name=name;
        this.phone=phone;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPhoneNumber(){
        return phone;
    }
    
    public void setName(String name){
        this.name=name;
    }
    public void setphoneNumber(String phone){
        this.phone=phone;
    }
    
    public String toString(){
        return "Name: " +name+", Phone: " + phone ;
    }
}
