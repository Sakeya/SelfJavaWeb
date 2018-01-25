package com.laffey.dao;

import com.laffey.model.Newsgroup;
import com.laffey.model.NewsgroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsgroupMapper {
    int countByExample(NewsgroupExample example);

    int deleteByExample(NewsgroupExample example);

    int deleteByPrimaryKey(Integer groupId);

    int insert(Newsgroup record);

    int insertSelective(Newsgroup record);

    List<Newsgroup> selectByExample(NewsgroupExample example);

    Newsgroup selectByPrimaryKey(Integer groupId);

    int updateByExampleSelective(@Param("record") Newsgroup record, @Param("example") NewsgroupExample example);

    int updateByExample(@Param("record") Newsgroup record, @Param("example") NewsgroupExample example);

    int updateByPrimaryKeySelective(Newsgroup record);

    int updateByPrimaryKey(Newsgroup record);
}