package com.example.azheng.rxjavamvpdemo;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.azheng.rxjavamvpdemo.base.BaseMvpActivity;
import com.example.azheng.rxjavamvpdemo.bean.BaseObjectBean;
import com.example.azheng.rxjavamvpdemo.bean.WeatherBean;
import com.example.azheng.rxjavamvpdemo.contract.MainContract;
import com.example.azheng.rxjavamvpdemo.presenter.MainPresenter;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.Gson;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends BaseMvpActivity<MainPresenter> implements MainContract.View {

    @BindView(R.id.et_username_login)
    TextInputEditText etUsernameLogin;
    @BindView(R.id.textlayout_username_login)
    TextInputLayout textlayoutUsernameLogin;
    @BindView(R.id.et_password_login)
    TextInputEditText etPasswordLogin;
    @BindView(R.id.textlayout_password_login)
    TextInputLayout textlayoutPasswordLogin;
    @BindView(R.id.btn_signin_login)
    Button btnSigninLogin;
    @BindView(R.id.tv_show_data)
    TextView tvShowData;
    @BindView(R.id.btn_weather)
    Button btnWeather;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
    }

    @OnClick({R.id.btn_signin_login, R.id.btn_weather})
    public void OnClickView(View view) {
        switch (view.getId()) {
            case R.id.btn_signin_login:
                if (getUsername().isEmpty()) {
                    Toast.makeText(this, "用户名不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (getPassword().isEmpty()) {
                    Toast.makeText(this, "密码不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                mPresenter.login(getUsername(), getPassword());
                break;
            case R.id.btn_weather:
                mPresenter.weather();
                break;
        }
    }

    /**
     * @return 帐号
     */
    private String getUsername() {
        return etUsernameLogin.getText().toString().trim();
    }

    /**
     * @return 密码
     */
    private String getPassword() {
        return etPasswordLogin.getText().toString().trim();
    }

    @Override
    public void onSuccess(BaseObjectBean bean) {
        Toast.makeText(this, bean.getErrorMsg(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(String errMessage) {

    }

    @Override
    public void weatherSuccess(WeatherBean weatherBean) {
        Gson gson = new Gson();
        tvShowData.setText(gson.toJson(weatherBean));
    }

    @Override
    public MainPresenter creatPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
