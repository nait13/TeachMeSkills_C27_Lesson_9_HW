package com.teachmeskills.lesson9_hw.task_3.card;

public abstract class BaseCard {
    private String cardNumber;
    private int id;
    private int cvcCvv;
    private double amountOnTheCard;
    private String currency;

    public BaseCard(String cardNumber, int id, int cvcCvv, double amountOnTheCard, String currency) {
        this.cardNumber = cardNumber;
        this.id = id;
        this.cvcCvv = cvcCvv;
        this.amountOnTheCard = amountOnTheCard;
        this.currency = currency;
    }

    // РАСМОТРЕТЬ!!!!!!!!!!!!!!
//    public abstract boolean checkCardBalanceBeforeTransfer();
//
//    public void showBaseCardInfo(){
//        System.out.println(cardNumber + "->" + amount + "->" + validDate);
//    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCvcCvv() {
        return cvcCvv;
    }

    public void setCvcCvv(int cvcCvv) {
        this.cvcCvv = cvcCvv;
    }

    public double getAmountOnTheCard() {
        return amountOnTheCard;
    }

    public void setAmountOnTheCard(double amountOnTheCard) {
        this.amountOnTheCard = amountOnTheCard;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
