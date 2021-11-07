package org.example.domain.dto;

import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;

import java.io.Serializable;

@RedisHash(value = "TokenHeader")
public class TokenHeaderDTO implements Serializable {
    private String id;
    private String token;

    // TTL in seconds
    // Count down every second
    // Get remaining TTL in seconds on every query
    @TimeToLive
    private Long ttl;

    public TokenHeaderDTO() {}
    public TokenHeaderDTO(String id, String token, Long ttl) {
        this.id = id;
        this.token = token;
        this.ttl = ttl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getTtl() {
        return ttl;
    }

    public void setTtl(Long ttl) {
        this.ttl = ttl;
    }
}
