package com.shopping.client.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 25/12/2020
 */
@FeignClient(name = "ZUUL-GATEWAY",url = "http://localhost:8086/")
public interface ShoppingClient {

    @GetMapping("/shopping/api/items")
    public String[] getItems();
}
