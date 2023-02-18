package ru.netology.oop.lvl1.l2.tax;

/**
 * @author: Baeva Nastasia
 */
public class TaxUnsIncomeMinusExpenses extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int result = (int)((debit - credit) * 0.15);
        return result < 0 ? 0 : result;
    }
}
