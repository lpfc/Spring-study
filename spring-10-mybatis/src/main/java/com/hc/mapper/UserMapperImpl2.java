package com.hc.mapper;

import com.hc.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author HC
 * @version 1.0
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{

    @Override
    public List<User> selectUser() {
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }
}
