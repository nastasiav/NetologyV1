package ru.netology.oop.lvl1.l2;

import ru.netology.oop.lvl1.l2.tax.TaxUnsIncome;
import ru.netology.oop.lvl1.l2.tax.TaxUnsIncomeMinusExpenses;

/**
 * @author: Baeva Nastasia
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("-------------Begin-----------");
        System.out.println("-------------1-----------");
        Company company = new Company("title 1", new TaxUnsIncome());
        System.out.println("FOR INCOME");
        company.shiftMoney(500);
        company.shiftMoney(-100);
        company.payTaxes();
        System.out.println("FOR INCOME MINUS EXPENSES");
        company.setTaxSystem(new TaxUnsIncomeMinusExpenses());
        company.shiftMoney(500);
        company.shiftMoney(-100);
        company.payTaxes();
        System.out.println("-------------2-----------");
        Deal[] deals = {
                new Sale("123", 500),
                new Expenditure("321", -100)
        };

        System.out.println("FOR INCOME MINUS EXPENSES");
        company.applyDeals(deals);

        System.out.println("FOR INCOME");
        company.setTaxSystem(new TaxUnsIncome());

        company.applyDeals(deals);
        System.out.println("-------------End-----------");
    }
}
