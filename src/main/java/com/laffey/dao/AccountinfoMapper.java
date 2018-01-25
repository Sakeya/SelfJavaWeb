package com.laffey.dao;

import com.laffey.model.Accountinfo;
import com.laffey.model.AccountinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountinfoMapper {
    int countByExample(AccountinfoExample example);

    int deleteByExample(AccountinfoExample example);

    int deleteByPrimaryKey(Integer accountId);

    int insert(Accountinfo record);

    int insertSelective(Accountinfo record);

    List<Accountinfo> selectByExample(AccountinfoExample example);

    Accountinfo selectByPrimaryKey(Integer accountId);

    int updateByExampleSelective(@Param("record") Accountinfo record, @Param("example") AccountinfoExample example);

    int updateByExample(@Param("record") Accountinfo record, @Param("example") AccountinfoExample example);

    int updateByPrimaryKeySelective(Accountinfo record);

    int updateByPrimaryKey(Accountinfo record);
}