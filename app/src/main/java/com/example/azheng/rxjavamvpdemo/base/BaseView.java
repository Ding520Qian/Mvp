package com.example.azheng.rxjavamvpdemo.base;



import autodispose2.AutoDisposeConverter;

/**
 * @author azheng
 * @date 2018/4/24.
 * GitHub：https://github.com/RookieExaminer
 * Email：wei.azheng@foxmail.com
 * Description：
 */
public interface BaseView {

    /**
     * 数据获取失败
     * @param errMessage
     */
    void onError(String errMessage);

    /**
     * 绑定Android生命周期 防止RxJava内存泄漏
     *
     * @param <T>
     * @return
     */
    <T> AutoDisposeConverter<T> bindAutoDispose();

}
