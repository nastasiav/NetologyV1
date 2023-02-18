package ru.netology.oop.lvl1.l2;

/**
 * @author: Baeva Nastasia
 */
public class Sale extends Deal{
    public Sale(String name, int debitChange) {
        super("",0,0);
        String comment = "Продажа " + name + " на " + debitChange + " руб.";
        setComment(comment);
        setCreditChange(0);
        setDebitChange(debitChange);
    }
}
