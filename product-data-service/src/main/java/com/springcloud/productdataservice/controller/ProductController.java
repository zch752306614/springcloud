package com.springcloud.productdataservice.controller;

import com.springcloud.productdataservice.pojo.Product;
import com.springcloud.productdataservice.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ProductController {

    @Resource
    ProductService productService;

    @RequestMapping(value = "/products")
    public Object products(){
        List<Product> ps = productService.listProducts();
        return ps;
    }

}
