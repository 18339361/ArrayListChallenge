package com.company;

public class Contact {
    private String name;
    private String phone;

    public Contact(String name, String phone){
        this.name= name;
        this.phone= phone;
    }

    public String getName(){
        return this.name;
    }

    public String getPhone(){
        return this.phone;
    }

    public static Contact createContact(String name, String phone){
       return  new Contact(name, phone);
    }
}
