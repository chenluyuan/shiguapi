package com.stom.school.dao.mapper;

import com.stom.school.dao.entity.Friends;

public interface FriendsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Friends record);

    int insertSelective(Friends record);

    Friends selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Friends record);

    int updateByPrimaryKey(Friends record);
}