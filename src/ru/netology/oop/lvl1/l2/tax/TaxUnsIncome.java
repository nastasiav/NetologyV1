package ru.netology.oop.lvl1.l2.tax;

/**
 * @author: Baeva Nastasia
 */
public class TaxUnsIncome extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return (int) (debit * 0.06);
    }
}
