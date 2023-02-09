package com.ssz.product.client.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.ssz.product.client.api")
@ComponentScan(basePackages = "com.ssz.product.client")
public class ProductClientConfig {
}
