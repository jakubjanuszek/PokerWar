package jancor.com.pokerwar.logic;

import java.util.Arrays;

/**
 * Created by janco on 06.04.2017.
 */

public class OneDeal {

    private String[] cards = new  String[5];

    public String getCard(int i) {
        return cards[i];
    }

    public void setCards(String[] cards) {
        this.cards = cards;
    }


    @Override
    public String toString() {
        return "OneDeal{" +
                "cards=" + Arrays.toString(cards) +
                '}';
    }
}
