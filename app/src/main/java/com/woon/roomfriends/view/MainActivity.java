package com.woon.roomfriends.view;

import android.os.Bundle;
import android.view.Menu;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.woon.roomfriends.R;
import com.woon.roomfriends.databinding.ActivityMainBinding;
import com.woon.roomfriends.utill.UiHelper;
import com.woon.roomfriends.viewmodel.MainViewModel;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        init();

    }

    private void init() {
        UiHelper.toolBarInitialize(this, binding.mainToolbar);
        UiHelper.hideWindow(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.cancel, menu);
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}