package com.yuanzf.debug;

import com.yuanzf.debug.mapper.UserOrderMapper;
import com.yuanzf.debug.model.UserOrderModel;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @Author: yzf
 * @Date: 2019-02-14 10:38
 * @Desoription: 一对多映射测试
 */
public class One2ManyTest {
    public static void main(String[] args) {
        String resource = "mybatis/mybatis-config.xml";
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = build.openSession();

            UserOrderMapper mapper = sqlSession.getMapper(UserOrderMapper.class);
            UserOrderModel yuan = mapper.getUserOrderByUserName("yuan");
            System.out.println(yuan);
            sqlSession.commit();
            sqlSession.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
