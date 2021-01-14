package com.jackie.common.utils;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Author: jackie
 * @Date: 2021/1/11 17:40
 * @Version: 1.0.0
 * @function: 自动生成代码
 */
public class PasswordUtils {

    /**
     * 密码生成工具类
     * @param salt
     * @param password
     * @return
     */
    public static String getPassword(String salt,String password){
        String pass=null;
        try {
            MessageDigest md=MessageDigest.getInstance("SHA-1");
            md.update(salt.getBytes("UTF-8"));
            md.update(password.getBytes("UTF-8"));
            byte[] result=md.digest();
            pass=new BigInteger(1,result).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return pass;
    }




}
