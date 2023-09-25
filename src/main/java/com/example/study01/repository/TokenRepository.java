package com.example.study01.repository;

import com.example.study01.entity.TokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<TokenEntity, Long> {
    TokenEntity findByRefreshToken(String refreshToken);
    TokenEntity findByUserEmail(String userEmail);
}
