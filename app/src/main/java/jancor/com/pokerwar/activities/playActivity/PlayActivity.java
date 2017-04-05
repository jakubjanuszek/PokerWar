package jancor.com.pokerwar.activities.playActivity;

import android.support.annotation.NonNull;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.OnClick;
import jancor.com.pokerwar.R;
import jancor.com.pokerwar.base.BaseActivity;
import jancor.com.pokerwar.utils.ActivityConfig;
import jancor.com.pokerwar.utils.ActivityConfigBuilder;

public class PlayActivity extends BaseActivity<IPlayView, PlayPresenter>
        implements IPlayView {

    @Bind(R.id.textView1) TextView textView1;
    @Bind(R.id.textView2) TextView textView2;
    @Bind(R.id.textView3) TextView textView3;
    @Bind(R.id.textView4) TextView textView4;
    @Bind(R.id.textView5) TextView textView5;

    @Bind(R.id.button) Button button;

    @OnClick(R.id.button)
    public void onClick(){
    presenter.cards();
    }

    @Override
    public void showCards(String[] cards) {
        textView1.setText(cards[0]);
        textView2.setText(cards[1]);
        textView3.setText(cards[2]);
        textView4.setText(cards[3]);
        textView5.setText(cards[4]);

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
