package com.example.azheng.rxjavamvpdemo.presenter;

import android.util.Log;

import com.example.azheng.rxjavamvpdemo.base.BasePresenter;
import com.example.azheng.rxjavamvpdemo.bean.BaseObjectBean;
import com.example.azheng.rxjavamvpdemo.bean.LoginBean;
import com.example.azheng.rxjavamvpdemo.bean.WeatherBean;
import com.example.azheng.rxjavamvpdemo.contract.MainContract;
import com.example.azheng.rxjavamvpdemo.model.MainModel;
import com.example.azheng.rxjavamvpdemo.net.RxScheduler;

import org.json.JSONObject;

import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;


/**
 * @author azheng
 * @date 2018/6/4.
 * GitHub：https://github.com/RookieExaminer
 * Email：wei.azheng@foxmail.com
 * Description：
 */
public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {

    private MainContract.Model model;

    public MainPresenter(MainContract.View mView) {
        super(mView);
        model = new MainModel();
    }

//    public MainPresenter() {
//        model = new MainModel();
//    }

    @Override
    public void login(String username, String password) {
        //View是否绑定 如果没有绑定，就不执行网络请求
        if (!isViewAttached()) {
            return;
        }
        model.login(username, password)
                .compose(RxScheduler.Obs_io_main())
                .to(mView.bindAutoDispose())//解决内存泄漏
                .subscribe(new Observer<BaseObjectBean<LoginBean>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                    }

                    @Override
                    public void onNext(@NonNull BaseObjectBean<LoginBean> loginBeanBaseObjectBean) {
                        mView.onSuccess(loginBeanBaseObjectBean);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        mView.onError(e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                    }
                });

    }

    @Override
    public void weather() {
        if (!isViewAttached()) {
            return;
        }
        model.weather().compose(RxScheduler.Obs_io_main())
                .to(mView.bindAutoDispose())
                .subscribe(new Observer<WeatherBean>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        Log.e("获取数据成功", "onSubscribe");
                    }

                    @Override
                    public void onNext(@NonNull WeatherBean s) {
                        Log.e("获取数据成功", "onNext");
                        mView.weatherSuccess(s);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.e("获取数据成功", "onError" + e.toString());
                        mView.onError(e.toString());
                    }

                    @Override
                    public void onComplete() {
                        Log.e("获取数据成功", "onComplete");
                    }
                });
    }
}
