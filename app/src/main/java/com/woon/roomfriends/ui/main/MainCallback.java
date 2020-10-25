package com.woon.roomfriends.ui.main;

import com.woon.roomfriends.data.entity.UserVo;
import java.util.List;

public interface MainCallback {
    void OnAddDataSuccess(List<UserVo> list);
}
