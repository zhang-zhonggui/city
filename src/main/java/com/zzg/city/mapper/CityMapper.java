package com.zzg.city.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzg.city.domain.entity.City;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CityMapper extends BaseMapper<City> {
    /**
     * 批量插入
     *
     * @param list
     * @return
     */
    int batchInsert(@Param("list") List<City> list);
}