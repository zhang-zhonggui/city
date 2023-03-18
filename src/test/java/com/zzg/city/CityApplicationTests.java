package com.zzg.city;

import com.alibaba.fastjson2.JSON;
import com.zzg.city.domain.entity.City;
import com.zzg.city.service.CityService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class CityApplicationTests {
    @Resource
    private CityService cityService;

    @Test
    void contextLoads() {
        City city = new City();
        city.setExtName("凉亭乡");
        List<City> cities = cityService.listCity(city);
        System.out.println(JSON.toJSON(cities));
    }

}
