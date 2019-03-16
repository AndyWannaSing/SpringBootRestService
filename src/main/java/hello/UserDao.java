package hello;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

/**
 * @author: Andy
 * @time: 2019/3/16 17:53
 * @since
 */
@Repository
public class UserDao {

    private final SqlSession sqlSession;

    public UserDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public User findOneUser(String phone) {
        return this.sqlSession.selectOne("findOneUser", phone);
    }

}
