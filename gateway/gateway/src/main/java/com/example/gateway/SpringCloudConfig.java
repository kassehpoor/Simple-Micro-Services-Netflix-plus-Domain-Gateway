package com.example.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {
    @Bean
    public RouteLocator gateWayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r-> r.path("/CourseApp/**")  .uri("lb://CourseApp")
                )
                .route(r->r.path("/UserApp/**")
                 .uri("lb://UserApp")
                )
                .build();
    }
}
