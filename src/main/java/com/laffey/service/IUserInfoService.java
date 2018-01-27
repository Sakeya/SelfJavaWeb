package com.laffey.service;

import com.laffey.model.Userinfo;
import com.laffey.model.UserinfoWithBLOBs;

/**
 * Created by laffey on 2018/1/24.
 */
public interface IUserInfoService {
    public Userinfo getUserInfoById(Integer id);
    public int AddUserInfo(UserinfoWithBLOBs userinfo);
}
