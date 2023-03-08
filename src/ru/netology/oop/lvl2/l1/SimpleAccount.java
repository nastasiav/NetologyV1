package ru.netology.oop.lvl2.l1;

/**
 * @author: Baeva Nastasia
 */
public class SimpleAccount extends Account {

    @Override
    public boolean add(long amount) {
        long result = this.amount + amount;
        if (result < 0) {
            return false;
        }
        else {
            this.amount = result;
            return true;
        }
    }

    @Override
    public boolean pay(long amount) {
        long result = this.amount - amount;
        if (result < 0) {
            return false;
        }
        else {
            this.amount = result;
            return true;
        }
    }

    @Override
    public boolean transfer(Account account, long amount) {
        boolean isPay = this.pay(amount);
        boolean isAdd = account.add(amount);
        if (isPay && isAdd) {
            return true;
        }
        else {
            if(isPay) {
                account.add(amount);
            }
            if(isAdd) {
                account.pay(amount);
            }
            return false;
        }
    }

    @Override
    public long getBalance() {
        return this.amount;
    }
}
