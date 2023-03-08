package ru.netology.oop.lvl2.l1;

/**
 * @author: Baeva Nastasia
 */
public class Main {
    public static void main(String[] args) {
        CreditAccount creditAccount = new CreditAccount(1000);
        SimpleAccount simpleAccount = new SimpleAccount();

        simpleAccount.add(100);
        System.out.println(simpleAccount.getBalance());
        simpleAccount.pay(50);
        System.out.println(simpleAccount.getBalance());
        simpleAccount.add(100);
        System.out.println(simpleAccount.getBalance());
        simpleAccount.pay(250);
        System.out.println(simpleAccount.getBalance());
        System.out.println("-----------------------------------");
        creditAccount.pay(50);
        System.out.println(creditAccount.getBalance());
        creditAccount.add(100);
        System.out.println(creditAccount.getBalance());
        creditAccount.pay(100);
        System.out.println(creditAccount.getBalance());
        creditAccount.add(100);
        System.out.println(creditAccount.getBalance());
        System.out.println("-----------------------------------");

        CreditAccount creditAccount2 = new CreditAccount(1000);
        SimpleAccount simpleAccount2 = new SimpleAccount();

        System.out.println(simpleAccount2.getBalance());
        simpleAccount.transfer(simpleAccount2, 50);
        System.out.println(simpleAccount.getBalance());
        System.out.println(simpleAccount2.getBalance());
    }
}
