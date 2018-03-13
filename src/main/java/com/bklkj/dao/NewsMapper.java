package com.bklkj.dao;

import com.bklkj.pojo.News;
import com.bklkj.pojo.NewsExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsMapper {
    int countByExample(NewsExample example);

    int deleteByExample(NewsExample example);

    int deleteByPrimaryKey(Integer newsid);

    int insert(News record);

    int insertSelective(News record);

    List<News> selectByExample(NewsExample example);

    News selectByPrimaryKey(Integer newsid);

    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

	List<News> selectAll(@Param("userid")String userid, @Param("usernews")String usernews,@Param("newsclassification") String newsclassification,@Param("newstime") Date newstime);

	List<News> selectAll();

	List<News> selectmsgType(@Param("userid")String userid, @Param("newsclassification")String newsclassification);

	List<News> selectusernews(@Param("userid")String userid, @Param("usernews")String usernews, @Param("newsclassification")String newsclassification, @Param("newstime")Date newstime);
}