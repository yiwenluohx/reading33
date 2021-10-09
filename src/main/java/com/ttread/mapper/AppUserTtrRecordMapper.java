package com.ttread.mapper;

import com.ttread.entity.AppUserTtrRecord;

public interface AppUserTtrRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(AppUserTtrRecord record);

    int insertSelective(AppUserTtrRecord record);

    AppUserTtrRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AppUserTtrRecord record);

    int updateByPrimaryKeyWithBLOBs(AppUserTtrRecord record);

    int updateByPrimaryKey(AppUserTtrRecord record);
}