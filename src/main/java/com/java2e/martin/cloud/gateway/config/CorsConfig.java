package com.java2e.martin.cloud.gateway.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


/**
 * @author 狮少
 * @version 1.0
 * @date 2019/9/20
 * @describtion CorsConfig
 * @since 1.0
 */
@Configuration
public class CorsConfig {
    @Bean
    public CorsResponseHeaderFilter corsResponseHeaderFilter() {
        return new CorsResponseHeaderFilter();
    }
}
