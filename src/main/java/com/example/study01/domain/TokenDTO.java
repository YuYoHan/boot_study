package com.example.study01.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class TokenDTO {
    private Long id;
    private String grantType;
    private String accessToken;
    private String refreshToken;

    @Builder
    public TokenDTO(Long id, String grantType, String accessToken, String refreshToken) {
        this.id = id;
        this.grantType = grantType;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }
}
