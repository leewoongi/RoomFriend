package com.woon.roomfriends.ui.main;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.woon.roomfriends.R;
import com.woon.roomfriends.data.entity.UserVo;
import com.woon.roomfriends.databinding.UserItemBinding;

import java.util.ArrayList;
import java.util.List;

public class UserInfoAdapter extends RecyclerView.Adapter<UserInfoAdapter.MyViewHolder> {

    private List<UserVo> userVoList = new ArrayList<>();
    private UserItemBinding binding;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.user_item,parent,false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.onBind(userVoList.get(position));
    }

    @Override
    public int getItemCount() {
        return userVoList.size();
    }

    public void addItems(List<UserVo> items) {
        userVoList = items;
        notifyDataSetChanged();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(@NonNull UserItemBinding itemView) {
            super(itemView.getRoot());
        }

        public void onBind(UserVo userVo) {
            Uri userImgUri = Uri.parse(userVo.getAvatar_url());
            Glide.with(itemView.getRootView()).load(userImgUri).into(binding.userImg);
            binding.userName.setText(userVo.getLogin());
            binding.userScore.setText(Double.toString(userVo.getScore()));
        }
    }
}
