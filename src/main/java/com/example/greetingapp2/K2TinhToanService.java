package com.example.greetingapp2;

import org.springframework.stereotype.Component;

@Component
public class K2TinhToanService implements TinhToanService {

    @Override
    public int cong(int a, int b) {
        return a + b;
    }
}
