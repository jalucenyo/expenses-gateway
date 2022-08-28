package com.lucenyo.expenses.gateway

import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class GatewayRoutes {

  @Bean
  fun gateway(routerBuilder: RouteLocatorBuilder): RouteLocator = routerBuilder
    .routes()
    .route { specs -> specs
      .path("/test")
      .filters { filter -> filter.setPath("/guides")}
      .uri("https://www.spring.io/")
    }
//    .route{ specs -> specs
//      .path("/api/v1/expenses")
//      .uri("")
//    }
    .build()

}