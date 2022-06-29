package com.company.Class34;
// create a Bank Class
// create private variables: balance, name, accountNum in Bank class
// create getters and setters for this variable
class Bank1 {
    private int balance;
    private String name;
    private int accountNum;

    //Getter
    public int getBalance() { return balance; }
    public String getName() { return name; }
    public int getAccountNum() { return accountNum; }

    //Setter
    public void setBalance(int balance) { this.balance = balance; }
    public void setName(String name) { this.name = name; }
    public void setAccountNum(int accountNum) { this.accountNum = accountNum; }
}

public class DisplayAccInfo{
    public static void main(String[] args) {
        Bank1 bank1 = new Bank1();
        bank1.setBalance(20000);
        bank1.setName("Johny");
        bank1.setAccountNum(12345);
    }

}
