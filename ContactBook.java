/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

import java.util.ArrayList;
import java.util.List;

public class ContactBook {
    
    public List<Contact> contacts=new ArrayList<>();
        
  
    
    public void addContact(Contact contact){
        contacts.add(contact);
        System.out.println("Contact added!");
    }
    public void displayContacts(){
        if(contacts.isEmpty()){
            System.out.println("No contacts found.");
        }else{
            System.out.println("\n---Contact List---");
            for(int i=0;i<contacts.size();i++){
                System.out.println(contacts.get(i));
            }
        }
    }
    
    public void deleteContact(String name){
        for(int i=0;i<contacts.size();i++){
            if(contacts.get(i).getName().equalsIgnoreCase(name)){
                contacts.remove(i);
                System.out.println("Contact deleted!");
                return;
            }
        }
        System.out.println("Contact not found!");
    }
    
}
