package jancor.com.pokerwar.base;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * Created by janco on 09.03.2017.
 */

public interface IBasePresenter <V extends MvpView> extends MvpPresenter<V> {
}