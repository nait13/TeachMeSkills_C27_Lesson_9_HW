package com.teachmeskills.lesson9_hw.task_3.runner;

import com.teachmeskills.lesson9_hw.task_3.card.BaseCard;
import com.teachmeskills.lesson9_hw.task_3.client.Client;
import com.teachmeskills.lesson9_hw.task_3.fabric.CardFabric;
import com.teachmeskills.lesson9_hw.task_3.utils.Utils;

import java.util.Scanner;


public class Runner {
    public static void main(String[] args) {

        BaseCard[] cards = CardFabric.createCards();

        Client client1 = new Client(
                "Oleg",
                "Maneev",
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
        BaseCard card1 = Utils.searchCard(client1.getCards(), idCard1);

        System.out.println("Введите код карты на которую будет осуществлён перевод:");
        int idCard2 = scanner.nextInt();
        BaseCard card2 = Utils.searchCard(client1.getCards(), idCard2);

        if (card1.getId() == card2.getId()) {
            System.out.println("Вы выбрали одинаковые карты!");
        } else {
            System.out.println("Введите сумму перевода: ");
            double transferAmount = scanner.nextDouble();

            System.out.println("Введите код CVC/CVV:");
            int userCvv = scanner.nextInt();

            scanner.close();
            Utils.transferToCard(card1, card2, transferAmount, userCvv);

            System.out.println("ENDS");
        }
    }
}
