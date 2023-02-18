package ru.netology.oop.lvl1.l2;

/**
 * @author: Baeva Nastasia
 */
public class Deal {
    private String comment;
    private int creditChange;
    private int debitChange;

    public Deal(String comment, int creditChange, int debitChange) {
        this.comment = comment;
        this.creditChange = creditChange;
        this.debitChange = debitChange;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getCreditChange() {
        return creditChange;
    }

    public void setCreditChange(int creditChange) {
        this.creditChange = creditChange;
    }

    public int getDebitChange() {
        return debitChange;
    }

    public void setDebitChange(int debitChange) {
        this.debitChange = debitChange;
    }
}
