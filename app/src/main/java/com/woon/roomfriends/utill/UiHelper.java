package com.woon.roomfriends.utill;

import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class UiHelper {

    public static void toolBarInitialize(AppCompatActivity activity, View view){
        Toolbar toolbar = (Toolbar) view;
        activity.setSupportActionBar((toolbar));
        ActionBar actionBar = activity.getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(false); // 뒤로가기 버튼, 디폴트로 true만 해도 백버튼이 생김
        actionBar.setDisplayShowTitleEnabled(false); // 제목 없애기
    }

    /**
     * 앱바 위에 보면 상태 표시줄이 있는데 상태표시줄을 없애는 코드
     **/
    public static void hideWindow(AppCompatActivity activity) {
        activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }


}
