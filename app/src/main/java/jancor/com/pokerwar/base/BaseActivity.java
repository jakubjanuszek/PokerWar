package jancor.com.pokerwar.base;

import android.os.Bundle;
import android.view.View;

import com.hannesdorfmann.mosby.mvp.MvpActivity;
import com.hannesdorfmann.mosby.mvp.delegate.ActivityMvpDelegateCallback;

import butterknife.ButterKnife;
import jancor.com.pokerwar.utils.ActivityConfig;
import timber.log.Timber;

/**
 * Created by janco on 09.03.2017.
 */

public abstract class BaseActivity<VIEW extends IBaseView,PRESENTER extends BasePresenter<VIEW>> extends MvpActivity<VIEW, PRESENTER>
        implements ActivityMvpDelegateCallback<VIEW, PRESENTER>, IBaseView{

    private ActivityConfig activityConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityConfig = getConfig();
        setContentView();

        initLibraries();

        addToCreate();


    }

    protected abstract ActivityConfig getConfig();
    protected abstract void addToCreate();

    private void setContentView() {
        View root = View.inflate(this, activityConfig.layoutId, null);
        setContentView(root);
    }
    private void initLibraries(){
        ButterKnife.bind(this);
        Timber.plant(new Timber.DebugTree());
    }

    @Override
    public BaseActivity getInstance() {
        return this;
    }


}