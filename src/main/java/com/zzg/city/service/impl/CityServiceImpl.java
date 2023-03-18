package com.zzg.city.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zzg.city.service.CityService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzg.city.mapper.CityMapper;
import com.zzg.city.domain.entity.City;

/**
 * @author zhang
 */
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements CityService {

    @Resource
    private CityMapper cityMapper;


    @Override
    public List<City> listCity(City city) {
        QueryWrapper<City> queryWrapper = new QueryWrapper<City>();
        queryWrapper.eq(StringUtils.isNotEmpty(city.getExtName()), "ext_name", city.getExtName());
        queryWrapper.eq(city.getId() != null, "id", city.getId());
        List<City> cities = cityMapper.selectList(queryWrapper);
        return cities;
    }
}
