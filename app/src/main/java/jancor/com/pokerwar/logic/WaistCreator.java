package jancor.com.pokerwar.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by janco on 10.03.2017.
 */

public class WaistCreator {
    private Integer i;
    private List<Card> cards = new ArrayList<>();

    public List<Card> deck(){
        for (Colours c :Colours.values()){
            i=2;
            for (Figures f:Figures.values()){
                Card card =new Card(f,c,i);
                i++;
                cards.add(card);
            }
        }
        return cards;
    }

}
