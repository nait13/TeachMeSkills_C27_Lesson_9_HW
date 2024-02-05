package com.teachmeskills.lesson9_hw.task_3.cardpaymentutil;

import com.teachmeskills.lesson9_hw.task_3.card.BaseCard;

import static com.teachmeskills.lesson9_hw.task_3.card.BaseCard.*;

/**
 * This class contains additional methods for working with cards.
 */
public class CardPaymentUtil {

    /**
     * This method checks the CVV code
     *
     * @param card    the card from which the transfer is carried out
     * @param userCvv accepts code CVV from user
     * @return true or false
     */
    public static boolean checkCVV(BaseCard card, int userCvv) {
        boolean checkCVV = false;
        if (card.getCvcCvv() == userCvv) {
            checkCVV = true;
        } else {
            System.out.println("Не верно указан CVC/CVV");
        }
        return checkCVV;
    }

    /**
     * This method checks the validity of the entered data before translation.
     *
     * @param card           the card from which the transfer is carried out
     * @param transferAmount The amount the user wants to withdraw
     * @param cardCvv        accepts code CVV from user
     * @return true/false
     */
    public static boolean checkCardBeforeTransfer(BaseCard card, double transferAmount, int cardCvv) {
        boolean checkLimit = false;
        if (card.getAmountOnTheCard() > 0 && card.getAmountOnTheCard() > getCommissionTransfer(card, transferAmount) + transferAmount) {
            if (checkCVV(card, cardCvv)) {
                if (checkTransferLimit(card, transferAmount)) {
                    checkLimit = true;
                } else {
                    showTransferLimit(card, transferAmount);
                }
            }
        } else {
            System.out.println("На карте не достаточно средств!");
        }
        return checkLimit;
    }

    /**
     * Shows the client the transfer limit
     */
    public static void showTransferLimit(BaseCard card, double amount) {
        double remainingTransferLimit;
        System.out.println("Вы достигли суточного лимита");
        if (card.getCurrency().equals("BYN")) {
            remainingTransferLimit = TRANSFER_LIMIT_FOR_BEL_CARD - card.getTransferLimit();
            System.out.println("Суточный лимит по карте " + TRANSFER_LIMIT_FOR_BEL_CARD + ". Вы можете внести: " + remainingTransferLimit);
        } else if (card.getCurrency().equals("USD")) {
            remainingTransferLimit = TRANSFER_LIMIT_FOR_MASTER_CARD - amount;
            System.out.println("Суточный лимит по карте " + TRANSFER_LIMIT_FOR_MASTER_CARD + ". Вы можете внести: " + remainingTransferLimit);
        } else if (card.getCurrency().equals("EUR")) {
            remainingTransferLimit = TRANSFER_LIMIT_FOR_VISA_CARD - amount;
            System.out.println("Суточный лимит по карте " + TRANSFER_LIMIT_FOR_VISA_CARD + ". Вы можете внести: " + remainingTransferLimit);
        }
    }

    /**
     * The method checks the daily transfer limit
     *
     * @param card   the card from which the transfer is carried out
     * @param amount The amount the user wants to withdraw
     * @return true or false
     */
    public static boolean checkTransferLimit(BaseCard card, double amount) {
        if (card.getCurrency().equals("BYN") && TRANSFER_LIMIT_FOR_BEL_CARD >= card.getTransferLimit() + amount) {
            return true;
        } else if (card.getCurrency().equals("USD") && TRANSFER_LIMIT_FOR_MASTER_CARD >= card.getTransferLimit() + amount) {
            return true;
        } else if (card.getCurrency().equals("EUR") && TRANSFER_LIMIT_FOR_VISA_CARD >= card.getTransferLimit() + amount) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method sets the commission for the transfer
     *
     * @param card           The card from which the transfer is carried out
     * @param transferAmount The amount the user wants to withdraw
     * @return Commission amount
     */
    public static double getCommissionTransfer(BaseCard card, double transferAmount) {
        if (card.getCurrency().equals("BYN")) {
            return (transferAmount * COMMISSION_FOR_BEL) / 100;
        } else if (card.getCurrency().equals("USD")) {
            return (transferAmount * COMMISSION_FOR_MASTER) / 100;
        } else {
            return (transferAmount * COMMISSION_FOR_VISA) / 100;
        }
    }
}
