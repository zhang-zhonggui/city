package com.zzg.city.domain.vo;

import com.zzg.city.domain.entity.City;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zhang
 */
@Data
@AllArgsConstructor
public class CityResponse {
    /**
     * code 状态码
     */
    private Integer code;
    /**
     * 查询的区划代码
     */
    private Long id;
    /**
     * 查询结果返回
     */
    private String msg;

    /**
     * 数据
     */
    private String data;


}
