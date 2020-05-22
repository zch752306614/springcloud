package com.springcloud.productviewserviceribbon.ribbon;

import com.springcloud.productviewserviceribbon.pojo.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@Component
public class ProductClientRibbon {

    @Resource
    RestTemplate restTemplate;

    public List<Product> listProducts() {
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
    }

}
