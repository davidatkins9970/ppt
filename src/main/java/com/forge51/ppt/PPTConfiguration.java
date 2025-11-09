package com.forge51.ppt;

import ch.qos.logback.core.testUtil.RandomUtil;
import com.forge51.ppt.model.IndustryClassification;
import com.forge51.ppt.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import java.util.Map;

@Configuration
public class PPTConfiguration {

    @Bean
    public Map<String, Product> products()
    {
        return Map.of("1", new Product("1", "Product One", 10L, 10L, IndustryClassification.FOOD_SERVICE),
                "2", new Product("2", "Product Two", 20L, 20L, IndustryClassification.MANUFACTURER),
                "3", new Product("3", "Product Three", 30L, 30L, IndustryClassification.RETAIL));
    }
}
