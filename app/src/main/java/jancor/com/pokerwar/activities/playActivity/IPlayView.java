package jancor.com.pokerwar.activities.playActivity;

import jancor.com.pokerwar.base.IBaseView;
import jancor.com.pokerwar.logic.OneDeal;

/**
 * Created by janco on 09.03.2017.
 */

public interface IPlayView extends IBaseView {
    void showCards(OneDeal[] deals);
}
