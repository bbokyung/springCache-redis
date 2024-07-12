package com.example.demo.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

// @EnableCaching
// @Configuration
public class RedisCacheManagerConfig {

  
    // @Bean
    // public CacheManager cacheManager(RedisConnectionFactory redisConnectionFactory) {
    //     // RedisSerializer<String> redisSerializer = new StringRedisSerializer();
    //     // RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig()
    //     //         .serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(redisSerializer));

    //     return RedisCacheManager.builder(redisConnectionFactory)
    //             // .cacheDefaults(redisCacheConfiguration)
    //             .build();
    // }
    
}
