package com.company.Class34_new;
//Access modifier/ Access specifier -> mechanism to achieve security of data
//Public -> everyone can access
//Private -> can be accessed in class only
//Protected -> can be accessed in the same package, or outside package but only in child/sub class
//Default -> accessible in the same package.


// Different package class 3
class Car{
    int color;

    public void method2(){
        // Bank b = new Bank(); cannot access Bank, because it's default
        // make Bank class public in Class34 to make it accessible

    }

}



// Different package class 4
class Animal {
    String food;
}
