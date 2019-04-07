package com.aa.rpt.infra.service;

import com.aa.rpt.infra.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
