package com.onurkenis.simpleservice.service.impl;

import com.onurkenis.simpleservice.entity.Simple;
import com.onurkenis.simpleservice.repository.SimpleRepository;
import com.onurkenis.simpleservice.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SimpleServiceImpl implements SimpleService {

    @Autowired
    SimpleRepository repository;

    @Override
    public Simple get(Long id) {
        Optional<Simple> optional = repository.findById(id);
        return optional.get();
    }

    @Override
    public Simple save(Simple simple) {
        Simple saved = repository.save(simple);
        return saved;
    }

    @Override
    public List<Simple> findAll() {
        List<Simple> list = repository.findAll();
        return list;
    }
}
