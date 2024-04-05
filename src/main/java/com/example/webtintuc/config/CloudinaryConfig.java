package com.example.webtintuc.config;


import com.cloudinary.Cloudinary;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CloudinaryConfig {
    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }

    @Bean
    public Cloudinary getCloudinary(){
        Map config = new HashMap();
        config.put("cloud_name", "dc91ux1fm");
        config.put("api_key", "415814237624261");
        config.put("api_secret", "Gmo9wOpRl2y9-g_6wXCpFYlxU5k");
        config.put("secure", true);

        return new Cloudinary(config);
    }
}
