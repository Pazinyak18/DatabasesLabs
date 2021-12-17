package com.example.pazyniak_jdbc;

import com.example.pazyniak_jdbc.passive.view.View;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class PazyniakJdbcApplication {

    public static void main(String[] args) {

        View view = new View();
        view.show();

    }
}
