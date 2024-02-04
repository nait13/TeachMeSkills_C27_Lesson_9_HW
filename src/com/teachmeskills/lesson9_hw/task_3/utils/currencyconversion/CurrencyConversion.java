package com.teachmeskills.lesson9_hw.task_3.utils.currencyconversion;

import com.teachmeskills.lesson9_hw.task_3.card.BaseCard;
import com.teachmeskills.lesson9_hw.task_3.utils.Const;

public class CurrencyConversion implements CurrencyExchangeRates, Const {
    public static double currencyConversion(BaseCard card1, BaseCard card2, double transferAmount) {
        if (card1.getCurrency().equals("BEL") && card2.getCurrency().equals("BEL")) {
            System.out.println("ДЕЛАЕМ ПЕРЕВОД БЕЗ КОНВЕРТАЦИИ");
            return transferAmount;

        } else if (card1.getCurrency().equals("BEL") && card2.getCurrency().equals("USD")) {
            System.out.println("Конвертируем валюту в USD");
            return transferAmount / EXCHANGE_RATE_BEL_FOR_USD;

        } else if (card1.getCurrency().equals("BEL") && card2.getCurrency().equals("EUR")) {
            System.out.println("Конвертируем валюту в EUR");
            return transferAmount / EXCHANGE_RATE_BEL_FOR_EUR;

        } else if (card1.getCurrency().equals("USD") && card2.getCurrency().equals("USD")) {
            System.out.println("Переводим USD");
            return transferAmount;

        } else if (card1.getCurrency().equals("USD") && card2.getCurrency().equals("BEL")) {
            System.out.println("Конвертируем валюту USD в BEL");
            return transferAmount * EXCHANGE_RATE_BEL_FOR_USD;

        } else if (card1.getCurrency().equals("USD") && card2.getCurrency().equals("EUR")) {
            System.out.println("Конвертируем валюту в UDS в EUR ");
            return transferAmount * EXCHANGE_RATE_OF_USD_FOR_EUR;

        } else if (card1.getCurrency().equals("EUR") && card2.getCurrency().equals("EUR")) {
            System.out.println("Просто переводим EUR");
            return transferAmount;

        } else if (card1.getCurrency().equals("EUR") && card2.getCurrency().equals("BEL")) {
            System.out.println("Конвертируем валюту EUR в BEL ");
            return transferAmount * EXCHANGE_RATE_BEL_FOR_EUR;

        } else if (card1.getCurrency().equals("EUR") && card2.getCurrency().equals("USD")) {
            System.out.println("Конвертируем валюту из ЕВРО в USD");
            return transferAmount * EXCHANGE_RATE_OF_EUR_FOR_USD;
        }else {
            System.out.println("Такой валюты у нас нет!");
            System.exit(1);
            return transferAmount;
        }
    }
}
