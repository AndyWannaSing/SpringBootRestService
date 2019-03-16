package hello;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author: Andy
 * @time: 2019/3/16 17:22
 * @since
 */
@Mapper
public interface UserMapper {
    User findOneUser(String phone);
}
