package com.yuanzf.debug;

import com.yuanzf.debug.mapper.UserMapper;
import com.yuanzf.debug.model.UserModel;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
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
//            List<Object> allUserList = sqlSession.selectList(nameSpace + ".getAllUserList");
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<UserModel> allUserList = mapper.getAllUserList();
            System.out.println(allUserList);
            sqlSession.commit();
            sqlSession.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
