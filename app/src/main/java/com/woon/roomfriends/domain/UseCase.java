package com.woon.roomfriends.domain;

import android.util.Log;

import com.woon.roomfriends.application.utill.RetrofitClient;
import com.woon.roomfriends.data.datasource.WebService;
import com.woon.roomfriends.data.entity.UserVo;
import com.woon.roomfriends.ui.main.MainCallback;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class UseCase {
    public void getUserInformation(String text, MainCallback callback){
        WebService webService = RetrofitClient.getInstance().create(WebService.class);
        Disposable disposable = webService.retrieveUser(text)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe((item) -> {
                    // onSuccess
                    callback.OnAddDataSuccess(item.getItems());
                }, (throwable -> {
                    // onFailed
                    Log.d("error", "TT.. " + throwable.getMessage());
                    throwable.printStackTrace();
                }), () -> {
                    // onComplete
                    Log.d("onComplete", "nothing");
                });
    }

}
