package ru.netology.oop.lvl1.l2;

/**
 * @author: Baeva Nastasia
 */
public class Expenditure extends Deal{
    public Expenditure(String name, int creditChange) {
        super("",0,0);
        String comment = "Покупка " + name + " на " + creditChange + " руб.";
        setComment(comment);
        setCreditChange(creditChange);
        setDebitChange(0);
    }
}
