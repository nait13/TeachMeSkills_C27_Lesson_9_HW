package com.teachmeskills.lesson9_hw.task_3.card.impl;

import com.teachmeskills.lesson9_hw.task_3.card.BaseCard;

public class VisaCard extends BaseCard {
    String country;

    public VisaCard(String cardNumber,
                    int id,
                    int cvcCvv,
                    double amountOnTheCard,
                    String currency,
                    String country) {
        super(cardNumber, id, cvcCvv, amountOnTheCard, currency);
        this.country = country;
    }
}