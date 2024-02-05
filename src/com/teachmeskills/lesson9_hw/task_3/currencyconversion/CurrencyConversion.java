package com.teachmeskills.lesson9_hw.task_3.currencyconversion;

import com.teachmeskills.lesson9_hw.task_3.card.BaseCard;
import com.teachmeskills.lesson9_hw.task_3.util.Const;

/**
 * This class converts currency
 */
public class CurrencyConversion implements CurrencyExchangeRates, Const {
    public static double currencyConversion(BaseCard card1, BaseCard card2, double transferAmount) {
        if (card1.getCurrency().equals("BYN") && card2.getCurrency().equals("BYN")) {
            return transferAmount;
        } else if (card1.getCurrency().equals("BYN") && card2.getCurrency().equals("USD")) {
            return transferAmount / EXCHANGE_RATE_BYN_TO_USD;
        } else if (card1.getCurrency().equals("BYN") && card2.getCurrency().equals("EUR")) {
            return transferAmount / EXCHANGE_RATE_BYN_TO_EUR;
        } else if (card1.getCurrency().equals("USD") && card2.getCurrency().equals("USD")) {
            return transferAmount;
        } else if (card1.getCurrency().equals("USD") && card2.getCurrency().equals("BYN")) {
            return transferAmount * EXCHANGE_RATE_BYN_TO_USD;
        } else if (card1.getCurrency().equals("USD") && card2.getCurrency().equals("EUR")) {
            return transferAmount * EXCHANGE_RATE_OF_USD_TO_EUR;
        } else if (card1.getCurrency().equals("EUR") && card2.getCurrency().equals("EUR")) {
            return transferAmount;
        } else if (card1.getCurrency().equals("EUR") && card2.getCurrency().equals("BYN")) {
            return transferAmount * EXCHANGE_RATE_BYN_TO_EUR;
        } else if (card1.getCurrency().equals("EUR") && card2.getCurrency().equals("USD")) {
            return transferAmount * EXCHANGE_RATE_OF_EUR_TO_USD;
        } else {
            System.out.println("Такой валюты у нас нет!");
            System.exit(1);
            return transferAmount;
        }
    }
}
