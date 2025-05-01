package oop1.ex;

public class Acount  {
    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 총 잔액은 " + balance + "원 입니다.");
    }

    void withdraw(int amount) {
        if (balance > amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금합니다. 총 잔액은 " + balance + "원 입니다.");
        } else {
            System.out.println("잔액 부족");
            System.out.println("잔고: " + balance);
        }
    }
}
