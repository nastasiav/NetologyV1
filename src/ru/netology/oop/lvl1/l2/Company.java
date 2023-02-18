package ru.netology.oop.lvl1.l2;

import ru.netology.oop.lvl1.l2.tax.TaxSystem;

/**
 * @author: Baeva Nastasia
 */
public class Company {
    private String title;
    private int debit;
    private int credit;
    private TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
        this.debit = 0;
        this.credit = 0;
    }

    public String getTitle() {
        return title;
    }

    public int getDebit() {
        return debit;
    }

    public int getCredit() {
        return credit;
    }

    public TaxSystem getTaxSystem() {
        return taxSystem;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount < 0) {
            this.credit += Math.abs(amount);
        }
        if (amount > 0) {
            this.debit += amount;
        }
    }

    public void payTaxes() {
        System.out.println("Компания " + title
                + " уплатила налог в размере: " + taxSystem.calcTaxFor(this.debit, this.credit) + " руб.");
        debit = 0;
        credit = 0;
    }

    public int applyDeals(Deal[] deals) {
        int res = 0;
        for (Deal deal : deals) {
            System.out.println(deal.getComment());
            this.shiftMoney(deal.getCreditChange());
            this.shiftMoney(deal.getDebitChange());
        }
        res = this.debit - this.credit;

        this.payTaxes();

        return res;
    }
}
