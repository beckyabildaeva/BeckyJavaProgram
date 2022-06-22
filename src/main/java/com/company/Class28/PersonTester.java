package com.company.Class28;

public class PersonTester {
    public static void main(String[] args) {
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Mike", "123456789");
        Person person3 = new Person();

        System.out.println("======Parameterized Constructor1=======");
        person1.personInformation();
        System.out.println("======Parameterized Constructor2=======");
        person2.personInformation();
        System.out.println("======No Arg Constructor=======");
        person3.personInformation();
    }
}
