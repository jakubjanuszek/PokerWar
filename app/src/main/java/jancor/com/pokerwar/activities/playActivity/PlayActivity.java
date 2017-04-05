package jancor.com.pokerwar.activities.playActivity;

import android.support.annotation.NonNull;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.OnClick;
import jancor.com.pokerwar.R;
import jancor.com.pokerwar.base.BaseActivity;
import jancor.com.pokerwar.logic.OneDeal;
import jancor.com.pokerwar.utils.ActivityConfig;
import jancor.com.pokerwar.utils.ActivityConfigBuilder;

public class PlayActivity extends BaseActivity<IPlayView, PlayPresenter>
        implements IPlayView {

    @Bind(R.id.textView1) TextView textView1;
    @Bind(R.id.textView2) TextView textView2;
    @Bind(R.id.textView3) TextView textView3;
    @Bind(R.id.textView4) TextView textView4;
    @Bind(R.id.textView5) TextView textView5;
    @Bind(R.id.textView6) TextView textView6;
    @Bind(R.id.textView7) TextView textView7;
    @Bind(R.id.textView8) TextView textView8;
    @Bind(R.id.textView9) TextView textView9;
    @Bind(R.id.textView10) TextView textView10;

    @Bind(R.id.button) Button button;

    @OnClick(R.id.button)
    public void onClick(){
    presenter.cards();
    }

    @Override
    public void showCards(OneDeal[] deals) {
        textView1.setText(deals[0].getCard(0));
        textView2.setText(deals[0].getCard(1));
        textView3.setText(deals[0].getCard(2));
        textView4.setText(deals[0].getCard(3));
        textView5.setText(deals[0].getCard(4));

        textView6.setText(deals[1].getCard(0));
        textView7.setText(deals[1].getCard(1));
        textView8.setText(deals[1].getCard(2));
        textView9.setText(deals[1].getCard(3));
        textView10.setText(deals[1].getCard(4));

    }

    @Override
    protected ActivityConfig getConfig() {
        return new ActivityConfigBuilder(R.layout.activity_play).build();
    }

    @Override
    protected void addToCreate() {

    }

    @NonNull
    @Override
    public PlayPresenter createPresenter() {
        return new PlayPresenter();
    }


}
