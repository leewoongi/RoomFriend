package com.woon.roomfriends.repos.entity;

import java.util.List;

public class ResponseDao {
    private int total_count;
    private boolean incomplete_results;
    private List<UserVo> items;

    public ResponseDao(int total_count, boolean incomplete_results, List<UserVo> items) {
        this.total_count = total_count;
        this.incomplete_results = incomplete_results;
        this.items = items;
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public boolean isIncomplete_results() {
        return incomplete_results;
    }

    public void setIncomplete_results(boolean incomplete_results) {
        this.incomplete_results = incomplete_results;
    }

    public List<UserVo> getItems() {
        return items;
    }

    public void setItems(List<UserVo> items) {
        this.items = items;
    }
}
