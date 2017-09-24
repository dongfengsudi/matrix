package com.dongfeng;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class MatrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(MatrixApplication.class, args);
    }
}
