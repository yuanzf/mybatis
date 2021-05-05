package com.yuanzf.debug;

import com.yuanzf.debug.mapper.UserMapper;
import com.yuanzf.debug.model.UserModel;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: yzf
 * @Date: 2018/11/26 17:14
 * @Desoription:
 */
public class test {
    public static void main(String[] args) {
        String resource = "mybatis/mybatis-config.xml";
        String nameSpace = "com.yuanzf.debug.mapper.UserMapper";
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = build.openSession();

//            HashMap<String, Object> stringObjectHashMap = new HashMap<>();
//            stringObjectHashMap.put("id",1);
//            stringObjectHashMap.put("name","yuan");
//            UserModel yuan = sqlSession.selectOne(nameSpace + ".getByName", stringObjectHashMap);
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            UserModel yuan = mapper.getByName(3, "yuan");
            System.out.println(yuan.getAddress());
            sqlSession.commit();
            sqlSession.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
