package oop1.ex;

public class AccountMain {

    public static void main(String[] args) {
        Acount acount = new Acount();

        acount.balance = 0;

        acount.deposit(10000);
        acount.withdraw(9000);
        acount.withdraw(2000);
    }
}
