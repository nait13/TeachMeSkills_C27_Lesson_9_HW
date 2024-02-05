package com.teachmeskills.lesson9_hw.task_3.card;

import com.teachmeskills.lesson9_hw.task_3.util.Const;

import static com.teachmeskills.lesson9_hw.task_3.cardpaymentutil.CardPaymentUtil.getCommissionTransfer;
import static com.teachmeskills.lesson9_hw.task_3.currencyconversion.CurrencyConversion.currencyConversion;

/**
 * This is an abstract class, all card are inherited from it
 */
public abstract class BaseCard implements Const {
    private String cardNumber;
    private int id;
    private int cvcCvv;
    private double amountOnTheCard;
    private String currency;
    private double transferLimit;

    public BaseCard(String cardNumber, int id, int cvcCvv, double amountOnTheCard, String currency) {
        this.cardNumber = cardNumber;
        this.id = id;
        this.cvcCvv = cvcCvv;
        this.amountOnTheCard = amountOnTheCard;
        this.currency = currency;
    }

    public void showBaseCardInfo() {
        System.out.println("Карта " + id + " Номер карты: " + cardNumber + " -> " + amountOnTheCard + " " + currency);
    }


    public static BaseCard searchCard(BaseCard[] arr, int idCard) {
        BaseCard foundCard = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId() == idCard) {
                foundCard = arr[i];
                break;
            }
        }
        if (foundCard == null) {
            System.out.println("Карта с ID № " + idCard + ", не найдена!");
            System.exit(1);
        }
        return foundCard;
    }

    public static void transferToCard(BaseCard card1, BaseCard card2, double transferAmount) {
        card1.setTransferLimit(transferAmount);
        double sumTransfer = getCommissionTransfer(card1, transferAmount) + transferAmount;
        card1.setAmountOnTheCard(card1.getAmountOnTheCard() - sumTransfer);
        card2.setAmountOnTheCard(card2.getAmountOnTheCard() + currencyConversion(card1, card2, transferAmount));
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getTransferLimit() {
        return transferLimit;
    }

    public void setTransferLimit(double transferLimit) {
        this.transferLimit += transferLimit;
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
        double roundedNumber = Math.round(amountOnTheCard * 100.0) / 100.0;
        this.amountOnTheCard = roundedNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
