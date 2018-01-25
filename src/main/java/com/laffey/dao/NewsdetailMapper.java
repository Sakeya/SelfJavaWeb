package com.laffey.dao;

import com.laffey.model.Newsdetail;
import com.laffey.model.NewsdetailExample;
import com.laffey.model.NewsdetailWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsdetailMapper {
    int countByExample(NewsdetailExample example);

    int deleteByExample(NewsdetailExample example);

    int deleteByPrimaryKey(Integer newsId);

    int insert(NewsdetailWithBLOBs record);

    int insertSelective(NewsdetailWithBLOBs record);

    List<NewsdetailWithBLOBs> selectByExampleWithBLOBs(NewsdetailExample example);

    List<Newsdetail> selectByExample(NewsdetailExample example);

    NewsdetailWithBLOBs selectByPrimaryKey(Integer newsId);

    int updateByExampleSelective(@Param("record") NewsdetailWithBLOBs record, @Param("example") NewsdetailExample example);

    int updateByExampleWithBLOBs(@Param("record") NewsdetailWithBLOBs record, @Param("example") NewsdetailExample example);

    int updateByExample(@Param("record") Newsdetail record, @Param("example") NewsdetailExample example);

    int updateByPrimaryKeySelective(NewsdetailWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NewsdetailWithBLOBs record);

    int updateByPrimaryKey(Newsdetail record);
}