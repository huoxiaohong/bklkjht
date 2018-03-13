package com.bklkj.dao;

import com.bklkj.pojo.Problemtemporary;
import com.bklkj.pojo.ProblemtemporaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProblemtemporaryMapper {
    int countByExample(ProblemtemporaryExample example);

    int deleteByExample(ProblemtemporaryExample example);

    int deleteByPrimaryKey(Integer rownum);

    int insert(Problemtemporary record);

    int insertSelective(Problemtemporary record);

    List<Problemtemporary> selectByExample(ProblemtemporaryExample example);

    Problemtemporary selectByPrimaryKey(Integer rownum);

    int updateByExampleSelective(@Param("record") Problemtemporary record, @Param("example") ProblemtemporaryExample example);

    int updateByExample(@Param("record") Problemtemporary record, @Param("example") ProblemtemporaryExample example);

    int updateByPrimaryKeySelective(Problemtemporary record);

    int updateByPrimaryKey(Problemtemporary record);
}