package com.bklkj.dao;

import com.bklkj.pojo.Activitytemporary;
import com.bklkj.pojo.ActivitytemporaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivitytemporaryMapper {
    int countByExample(ActivitytemporaryExample example);

    int deleteByExample(ActivitytemporaryExample example);

    int deleteByPrimaryKey(Integer rownum);

    int insert(Activitytemporary record);

    int insertSelective(Activitytemporary record);

    List<Activitytemporary> selectByExample(ActivitytemporaryExample example);

    Activitytemporary selectByPrimaryKey(Integer rownum);

    int updateByExampleSelective(@Param("record") Activitytemporary record, @Param("example") ActivitytemporaryExample example);

    int updateByExample(@Param("record") Activitytemporary record, @Param("example") ActivitytemporaryExample example);

    int updateByPrimaryKeySelective(Activitytemporary record);

    int updateByPrimaryKey(Activitytemporary record);

	List<String> selectall();
}