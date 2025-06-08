package com.example.demo1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ClientRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Currently Running ClientRunner!!");
    }
}
