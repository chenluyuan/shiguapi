package com.stom.school.dao.mapper;

import com.stom.school.dao.entity.Setting;

public interface SettingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Setting record);

    int insertSelective(Setting record);

    Setting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Setting record);

    int updateByPrimaryKey(Setting record);
}