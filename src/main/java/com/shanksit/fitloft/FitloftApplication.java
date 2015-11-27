package com.shanksit.fitloft;

import com.shanksit.fitloft.domain.User;
import com.shanksit.fitloft.repository.UserRpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.shanksit.fitloft")
public class FitloftApplication {
    public static void main(String[] args) {
        SpringApplication.run(FitloftApplication.class, args);
    }
}
