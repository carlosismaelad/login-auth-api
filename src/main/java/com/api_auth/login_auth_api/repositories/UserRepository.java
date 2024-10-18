package com.api_auth.login_auth_api.repositories;

import com.api_auth.login_auth_api.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
