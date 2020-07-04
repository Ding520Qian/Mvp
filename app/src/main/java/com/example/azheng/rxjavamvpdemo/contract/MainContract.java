package com.example.azheng.rxjavamvpdemo.contract;

import com.example.azheng.rxjavamvpdemo.base.BaseView;
import com.example.azheng.rxjavamvpdemo.bean.BaseObjectBean;
import com.example.azheng.rxjavamvpdemo.bean.LoginBean;
import com.example.azheng.rxjavamvpdemo.bean.WeatherBean;

import org.json.JSONObject;

import io.reactivex.rxjava3.core.Observable;


/**
 * @author azheng
 * @date 2018/6/4.
 * GitHub：https://github.com/RookieExaminer
 * Email：wei.azheng@foxmail.com
 * Description：
 */
public interface MainContract {
    interface Model {
        Observable<BaseObjectBean<LoginBean>> login(String username, String password);

        Observable<WeatherBean> weather();
    }

    interface View extends BaseView {
        @Override
        void onError(String errMessage);

        void onSuccess(BaseObjectBean<LoginBean> bean);

        void weatherSuccess(WeatherBean weatherBean);
    }

    interface Presenter {
        /**
         * 登陆
         *
         * @param username
         * @param password
         */
        void login(String username, String password);

        void weather();
    }
}
