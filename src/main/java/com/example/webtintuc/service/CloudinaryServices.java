package com.example.webtintuc.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface CloudinaryServices {
    public Map upload(MultipartFile file);
}
