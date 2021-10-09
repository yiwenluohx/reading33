package com.ttread.mapper;

import com.ttread.entity.AppUserInfo;

public interface AppUserInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(AppUserInfo record);

    int insertSelective(AppUserInfo record);

    AppUserInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AppUserInfo record);

    int updateByPrimaryKey(AppUserInfo record);
}