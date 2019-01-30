package com.onurkenis.simpleservice.service;

import com.onurkenis.simpleservice.entity.Simple;

import java.util.List;

public interface SimpleService {

    Simple get(Long id);

    Simple save(Simple simple);

    List<Simple> findAll();
}
