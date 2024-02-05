package com.teachmeskills.lesson9_hw.task_3.runner;

import com.teachmeskills.lesson9_hw.task_3.card.BaseCard;
import com.teachmeskills.lesson9_hw.task_3.cardpaymentutil.CardPaymentUtil;
import com.teachmeskills.lesson9_hw.task_3.client.Client;
import com.teachmeskills.lesson9_hw.task_3.fabric.CardFabric;

import java.util.Scanner;

/**
 * Here the project is started and the logic is described
 */
public class Runner {
    public static void main(String[] args) {
        BaseCard[] cards = CardFabric.createCards();

        Client client1 = new Client(
                "Alex",
                "Makaron",
                "HB32345",
                "13.02.1998",
                "23456",
                "Belarus",
                "Gomel",
                "Golovatskogo",
                "13",
                cards
        );

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите код карты с которой будет осуществлён перевод:");
        int idCard1 = scanner.nextInt();
        BaseCard card1 = BaseCard.searchCard(client1.getCards(), idCard1);

        System.out.println("Введите код карты на которую будет осуществлён перевод:");
        int idCard2 = scanner.nextInt();
        BaseCard card2 = BaseCard.searchCard(client1.getCards(), idCard2);

        if (card1.getId() != card2.getId()) {
            System.out.println("Введите сумму перевода: ");
            double transferAmount = scanner.nextDouble();
            System.out.println("Коммисия за перевод: " + CardPaymentUtil.getCommissionTransfer(card1, transferAmount));
            if (transferAmount <= 0) {
                System.out.println("Не правилно ввели сумму для перевода!");
            } else {
                System.out.println("Введите код CVC/CVV:");
                int userCvv = scanner.nextInt();
                scanner.close();
                if (CardPaymentUtil.checkCardBeforeTransfer(card1, transferAmount, userCvv)) {
                    System.out.println("****Information****");
                    client1.showInformationClient();
                    card1.showBaseCardInfo();
                    card2.showBaseCardInfo();
                    System.out.println("После перевода");
                    BaseCard.transferToCard(card1, card2, transferAmount);
                    card1.showBaseCardInfo();
                    card2.showBaseCardInfo();
                    System.out.println("Коммисия за перевод: " + CardPaymentUtil.getCommissionTransfer(card1, transferAmount));
                }
            }
        } else {
            System.out.println("Ошибка, вы выбрали одинаковые карты!");
        }
    }
}
