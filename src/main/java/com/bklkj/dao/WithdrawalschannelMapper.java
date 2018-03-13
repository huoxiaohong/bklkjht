package com.bklkj.dao;

import com.bklkj.pojo.Withdrawalschannel;
import com.bklkj.pojo.WithdrawalschannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WithdrawalschannelMapper {
    int countByExample(WithdrawalschannelExample example);

    int deleteByExample(WithdrawalschannelExample example);

    int deleteByPrimaryKey(Integer withdrawalschannelid);

    int insert(Withdrawalschannel record);

    int insertSelective(Withdrawalschannel record);

    List<Withdrawalschannel> selectByExample(WithdrawalschannelExample example);

    Withdrawalschannel selectByPrimaryKey(Integer withdrawalschannelid);

    int updateByExampleSelective(@Param("record") Withdrawalschannel record, @Param("example") WithdrawalschannelExample example);

    int updateByExample(@Param("record") Withdrawalschannel record, @Param("example") WithdrawalschannelExample example);

    int updateByPrimaryKeySelective(Withdrawalschannel record);

    int updateByPrimaryKey(Withdrawalschannel record);
}