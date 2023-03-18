package com.zzg.city.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzg.city.domain.entity.City;

import java.util.List;

public interface CityService extends IService<City> {


    List<City> listCity(City city);
}

