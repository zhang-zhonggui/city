package com.zzg.city.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName(value = "city")
@Data
public class City implements Serializable {
    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 父id
     */
    @TableField(value = "pid")
    private Long pid;

    /**
     * 等级
     */
    @TableField(value = "deep")
    private String deep;

    /**
     * 名称
     */
    @TableField(value = "`name`")
    private String name;

    @TableField(value = "pinyin_prefix")
    private String pinyinPrefix;

    /**
     * 拼音
     */
    @TableField(value = "pinyin")
    private String pinyin;

    /**
     * 子id
     */
    @TableField(value = "ext_id")
    private Long extId;

    @TableField(value = "ext_name")
    private String extName;


}