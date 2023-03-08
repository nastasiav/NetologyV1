package ru.netology.oop.lvl2.l1;

/**
 * @author: Baeva Nastasia
 */
public abstract class Account {
    long amount;
    public abstract boolean add(long amount);
    public abstract boolean pay(long amount);
    public abstract boolean transfer(Account account, long amount);
    public abstract long getBalance();
}
