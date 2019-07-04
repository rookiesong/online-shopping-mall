package net.suncaper.demo.service;

import net.suncaper.demo.domain.Product;

import java.util.List;

public interface HomeService {
    List<Product> recommendBySale();
}