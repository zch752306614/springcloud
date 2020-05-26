package com.springcloud.productviewservicefeign.controller;

import com.springcloud.productviewservicefeign.pojo.Product;
import com.springcloud.productviewservicefeign.service.ProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RefreshScope
public class ProductController {

    @Resource
    ProductService productService;

    @Value("${version}")
    String version;

    @RequestMapping("/products")
    public Object products(Model m) {
        List<Product> ps = productService.listProducts();
        m.addAttribute("version", version);
        m.addAttribute("ps", ps);
        System.out.println(version);
        return "products";
    }

}
