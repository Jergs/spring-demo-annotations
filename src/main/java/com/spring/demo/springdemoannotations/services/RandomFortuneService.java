package com.spring.demo.springdemoannotations.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class RandomFortuneService implements FortuneService {

    private final List<String> data = List.of("Some string", "Another one", "One more");
    private final Random random = new Random();

    @Override
    public String getFortune() {
        int index = random.nextInt(data.size());
        return data.get(index);
    }
}
