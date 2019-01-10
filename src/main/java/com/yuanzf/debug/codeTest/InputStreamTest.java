package com.yuanzf.debug.codeTest;

import com.yuanzf.debug.mapper.UserMapper;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: yzf
 * @Date: 2018-12-20 16:16
 * @Desoription:
 */
public class InputStreamTest {
    public static void main(String[] args) {
        InputStream inputStream = UserMapper.class.getResourceAsStream("/com/yuanzf/debug/mapper/UserMapper.xml");
        byte[] bytes = new byte[0];
        try {
            bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String  string = new String(bytes);
        System.out.println(string);
    }

}
