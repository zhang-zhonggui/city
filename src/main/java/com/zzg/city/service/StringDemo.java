package com.zzg.city.service;

import org.apache.commons.lang3.StringUtils;

/**
 * @author zhang
 */
public class StringDemo {


    public static void main(String[] args) {
        String s = "   ";
        boolean a = StringUtils.isEmpty(s);
        boolean b = StringUtils.isBlank(s);
        System.out.println(s.length());
        System.out.println(a);
        System.out.println(b);
    }
}
