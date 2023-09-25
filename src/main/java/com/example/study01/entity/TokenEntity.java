package com.example.study01.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity(name = "token")
@Table
@ToString
@Getter
@NoArgsConstructor
public class TokenEntity {
    @Id @GeneratedValue
    @Column(name = "token_id")
    private Long id;

    private String grantType;
    private String accessToken;
    private String refreshToken;

    @Builder
    public TokenEntity(Long id, String grantType, String accessToken, String refreshToken) {
        this.id = id;
        this.grantType = grantType;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }
}
