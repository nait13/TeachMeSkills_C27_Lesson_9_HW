package com.teachmeskills.lesson9_hw.task_3.fabric;

import com.teachmeskills.lesson9_hw.task_3.card.BaseCard;
import com.teachmeskills.lesson9_hw.task_3.card.impl.*;

public class CardFabric {
    public static BaseCard[] createCards() {
        BaseCard belCard1 = new BelCard("111-333", 1, 122, 3000.10,"BEL");
        BaseCard belCard2 = new BelCard("111-222", 2, 222, 1500.10,"BEL");
        BaseCard masterCard1 = new MasterCard("2223-123", 3, 322, 2500, "USD", "USD");
        BaseCard visaCard1 = new VisaCard("3334-222", 4, 322, 1250.10, "EUR", "EUR");

        BaseCard[] cards = {belCard1, belCard2, masterCard1, visaCard1};
        return cards;
    }
}
