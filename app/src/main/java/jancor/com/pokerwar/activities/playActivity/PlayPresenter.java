package jancor.com.pokerwar.activities.playActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import jancor.com.pokerwar.base.BasePresenter;
import jancor.com.pokerwar.logic.Card;
import jancor.com.pokerwar.logic.WaistCreator;

/**
 * Created by janco on 09.03.2017.
 */

public class PlayPresenter extends BasePresenter<IPlayView> implements IPlayPresenter {

    String[] deal = new  String[5];

    public String[] DealCards(){
        String[] deal = new  String[5];

        WaistCreator waist = new WaistCreator();
        List<Card> cards = waist.deck();
        Random random = new Random();

        for(int i=0; i<5; i++){
            int a =random.nextInt(cards.size()-(i+1))+0;
            deal[i]=cards.get(a).toString();
            cards.remove(a);
        }

        return deal;
    }


    public void cards(){
        getView().showCards(DealCards());
    }
}

