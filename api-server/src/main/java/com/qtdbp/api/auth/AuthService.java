package com.qtdbp.api.auth;

import com.qtdbp.api.user.ApiUser;

public interface AuthService {
    ApiUser register(ApiUser userToAdd);
    String login(String username, String password);
    String refresh(String oldToken);
}
