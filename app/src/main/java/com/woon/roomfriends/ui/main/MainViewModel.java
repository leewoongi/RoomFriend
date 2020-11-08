package com.woon.roomfriends.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.woon.roomfriends.data.entity.UserVo;
import com.woon.roomfriends.domain.UseCase;

import java.util.List;

public class MainViewModel extends ViewModel implements MainCallback {
    private MutableLiveData<List<UserVo>> _userVoList;
    public LiveData<List<UserVo>> userVoList;
    private UseCase useCase;
    public String searchText = "";

    public MainViewModel() {
        useCase = new UseCase();
        _userVoList = new MutableLiveData<>();
        userVoList = _userVoList;
    }

    public void retrieveUser(){
        if (!searchText.isEmpty() || !searchText.equals("")) {
            useCase.getUserInformation(searchText, this);
        }
    }

    @Override
    public void onAddDataSuccess(List<UserVo> list) {
        _userVoList.postValue(list);
    }

}
