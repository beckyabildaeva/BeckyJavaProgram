package com.company.SmallGroup;

import java.util.ArrayList;
import java.util.Iterator;

/*
Task is:
Using OOP, create a Class Account, which has fields Login*, Password*, Firstname*, Lastname*, Age*, City, Place of work, Family status, ID.
Fields marked with star * are mandatory

Create several constructors (for all mandatory and each non-mandatory fields)

ID has to be generated by program and assigned to each new account

Implement Encapsulation with restrictions (like age cannot be negative number and etc)

In new Class, create three users
For user1 - change firstname
For user2 - change City
For user3 - change both login and password
Printout fields before and after the change of each user
 */
public class AccountVlad {
    //Implement Encapsulation with restrictions (like age cannot be negative number and etc)
    private String login, password, firstName, lastName, city, place_Of_Work, family_Status;
    private Integer age;
    private Long ID;

    public AccountVlad(String login, String password, String firstName, String lastName, int age) {
        if (login.equals("") || password.equals("") || firstName.equals("") || lastName.equals("") || age < 0) {
            throw new RuntimeException("Illegal empty fields");
        }
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ID = (long) (Math.random() * Long.MAX_VALUE / 2);
        System.out.println("Login: " + this.login + "\nPassword: " + this.password + "\nFirst Name: " + this.firstName + "\nLast Name: " + this.lastName + "\nAge: " + this.age + "\nID: " + this.ID + "\nCity: " + this.city);
        System.out.println();
    }

    public AccountVlad(String login, String password, String firstName, String lastName, int age, String city) {
        if (login.equals("") || password.equals("") || firstName.equals("") || lastName.equals("") || age < 0) {
            throw new RuntimeException("Illegal empty fields");
        }
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.ID = (long) (Math.random() * Long.MAX_VALUE / 2);
        System.out.println("Login: " + this.login + "\nPassword: " + this.password + "\nFirst Name: " + this.firstName + "\nLast Name: " + this.lastName + "\nAge: " + this.age + "\nID: " + this.ID + "\nCity: " + this.city);
        System.out.println();

    }

    public AccountVlad(String login, String password, String firstName, String lastName, int age, String city, String place_Of_Work) {
        if (login.equals("") || password.equals("") || firstName.equals("") || lastName.equals("") || age < 0) {
            throw new RuntimeException("Illegal empty fields");
        }
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.place_Of_Work = place_Of_Work;
        this.ID = (long) (Math.random() * Long.MAX_VALUE / 2);
        System.out.println("Login: " + this.login + "\nPassword: " + this.password + "\nFirst Name: " + this.firstName + "\nLast Name: " + this.lastName + "\nAge: " + this.age + "\nID: " + this.ID + "\nCity: " + this.city + "\nPlace Of Work: " + this.place_Of_Work);
        System.out.println();
    }

    public AccountVlad(String login, String password, String firstName, String lastName, int age, String city, String place_Of_Work, String family_Status) {
        if (login.equals("") || password.equals("") || firstName.equals("") || lastName.equals("") || age < 0) {
            throw new RuntimeException("Illegal empty fields");
        }
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.place_Of_Work = place_Of_Work;
        this.family_Status = family_Status;
        this.ID = (long) (Math.random() * Long.MAX_VALUE / 2);
        System.out.println("Login: " + this.login + "\nPassword: " + this.password + "\nFirst Name: " + this.firstName + "\nLast Name: " + this.lastName + "\nAge: " + this.age + "\nID: " + this.ID + "\nCity: " + this.city + "\nPlace Of Work: " + this.place_Of_Work + "\nFamily Status: " + this.family_Status);
        System.out.println();
    }

    //----------------------------------------------------------------------
    public int getAge() { return age; }

    public String getLogin() { return login; }

    public String getCity() { return city; }

    public String getFamily_Status() { return family_Status; }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public String getPassword() { return password; }

    public String getPlace_Of_Work() { return place_Of_Work; }

    //-----------------------------------------------------------------------------------
    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
        System.out.println(this.age);
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setFamily_Status(String family_Status) {
        this.family_Status = family_Status;
    }

    public void setFirstName(String firstName) {
        if (firstName.equals("")) {
            throw new RuntimeException("Invalid no Name");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.equals("")) {
            throw new RuntimeException("Invalid no Last Name");
        }
        this.lastName = lastName;
    }

    public void setLogin(String login) {
        if (login.equals("")) {
            throw new RuntimeException("Invalid no Login Username");
        }
        this.login = login;
    }

    public void setPassword(String password) {
        if (password.equals("")) {
            throw new RuntimeException("Invalid no empty password");
        }
        this.password = password;
    }

    public void setPlace_Of_Work(String place_Of_Work) {
        this.place_Of_Work = place_Of_Work;
    }
    public void display(AccountVlad acc){
        ArrayList<Object> list = new ArrayList<>();
        list.add(acc.age);
        list.add(acc.ID);
        list.add(acc.firstName);
        list.add(acc.lastName);
        list.add(acc.login);
        list.add(acc.password);
        list.add(acc.city);
        list.add(acc.family_Status);
        list.add(acc.place_Of_Work);

        Iterator<Object> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        /*
        In new Class, create three users
        For user1 - change firstname
        For user2 - change City
        For user3 - change both login and password
        Printout fields before and after the change of each user
         */
        AccountVlad user1 = new AccountVlad("abc","123","Bob","Ross",1, "New York City");
        AccountVlad user2 = new AccountVlad("abc", "123", "Steven", "Hawkings", 20, "San Francisco", "Google");
        AccountVlad user3 = new AccountVlad("abc", "123", "Bob", "Marley", 50, "Los Angeles", "Restraunt", "Good");

        user1.display(user1);
        user1.display(user2);
        user1.display(user3);
        user1.setFirstName("Steven");
        user2.setCity("Paris");
        user3.setLogin("Login");
        user3.setPassword("Password");

        System.out.println("user 1");
        user1.display(user1);
        System.out.println("user 2");
        user1.display(user2);
        System.out.println("user 3");
        user1.display(user3);

    }
}

