package com.teachmeskills.lesson9_hw.task_3.fabric;

import com.teachmeskills.lesson9_hw.task_3.card.BaseCard;
import com.teachmeskills.lesson9_hw.task_3.card.impl.*;

/**
 * This class creates an instance of BaseCard cards and returns an array of cards.
 */
public class CardFabric {
    public static BaseCard[] createCards() {
        BaseCard belCard1 = new BelCard("111-333", 1, 111, 3000.10, "BYN");
        BaseCard belCard2 = new BelCard("111-222", 2, 111, 1500.10, "BYN");
        BaseCard masterCard1 = new MasterCard("2223-123", 3, 111, 2500, "USD", "USD");
        BaseCard visaCard1 = new VisaCard("3334-222", 4, 111, 1250.10, "EUR", "EUR");

        BaseCard[] cards = {belCard1, belCard2, masterCard1, visaCard1};

        return cards;
    }
}
