package com.example.greetingapp2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy  // Bật tính năng AOP
public class MainApplication implements CommandLineRunner {

    private final TinhToanService tinhToanService;

    public MainApplication(TinhToanService tinhToanService) {
        this.tinhToanService = tinhToanService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        int result = tinhToanService.cong(2, 3);
        System.out.println("Kết quả phép cộng: " + result);
    }
}
