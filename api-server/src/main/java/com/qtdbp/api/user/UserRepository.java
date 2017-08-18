package com.qtdbp.api.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 类功能说明：用户管理Dao层
 *
 * <p>Copyright: Copyright © 2012-2013 zrhis.com Inc.</p>
 * @author caidchen
 * @version v1.0
 *
 */
@Repository
public interface UserRepository extends JpaRepository<ApiUser, String> {

    /**
     * 查询用户信息
     * @param username
     * @return
     */
    ApiUser findByUsername(final String username);
}
