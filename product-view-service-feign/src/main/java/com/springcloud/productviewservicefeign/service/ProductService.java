package com.springcloud.productviewservicefeign.service;

import com.springcloud.productviewservicefeign.feign.ProductClientFeign;
import com.springcloud.productviewservicefeign.pojo.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductService {

    @Resource
    ProductClientFeign productClientFeign;

    public List<Product> listProducts(){
        return productClientFeign.listProducts();
    }

}
