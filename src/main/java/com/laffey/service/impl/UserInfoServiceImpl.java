package com.laffey.service.impl;

import com.laffey.dao.UserinfoMapper;
import com.laffey.model.Userinfo;
import com.laffey.model.UserinfoWithBLOBs;
import com.laffey.service.IUserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service(value = "UserInfoService")
public class UserInfoServiceImpl implements IUserInfoService {
    @Resource
    private UserinfoMapper userinfoMapper;

    @Transactional
    public Userinfo getUserInfoById(Integer id) {
        return this.userinfoMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public int AddUserInfo(UserinfoWithBLOBs userinfo){
        System.out.println("in service");
        return userinfoMapper.insert(userinfo);
    }
}
