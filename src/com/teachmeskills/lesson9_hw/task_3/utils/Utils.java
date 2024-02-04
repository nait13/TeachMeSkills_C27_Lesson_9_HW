package com.teachmeskills.lesson9_hw.task_3.utils;

import com.teachmeskills.lesson9_hw.task_3.card.BaseCard;

import static com.teachmeskills.lesson9_hw.task_3.utils.currencyconversion.CurrencyConversion.currencyConversion;

public class Utils implements Const {
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

    public static void transferToCard(BaseCard card1, BaseCard card2, double transferAmount, int userCvv) {
        if (checkCVV(card1, userCvv) && card1.getAmountOnTheCard() > 0 && transferAmount > 0) {
            if (card1.getAmountOnTheCard() + getCommissionTransfer(transferAmount) > transferAmount) {
                double sumTransfer = getCommissionTransfer(transferAmount) + transferAmount;
                card1.setAmountOnTheCard(card1.getAmountOnTheCard() - sumTransfer);
                card2.setAmountOnTheCard(card2.getAmountOnTheCard() + currencyConversion(card1, card2, transferAmount));
            }
        }else {
            System.out.println("Не коректно введённые данные");
        }
    }

    private static boolean checkCVV(BaseCard card, int userCvv) {
        boolean checkCVV = false;
        if (card.getCvcCvv() == userCvv) {
            checkCVV = true;
        } else {
            System.out.println("Не верно указан CVC/CVV");
        }
        return checkCVV;
    }

    public static double getCommissionTransfer(double transferAmount) {
        return (transferAmount * COMMISSION) / 100;
    }
}
