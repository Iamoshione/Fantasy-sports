package com.example.fpl.fantasy;

import com.example.fpl.fantasy.controller.http.HttpRequestManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class FantasyFootballApiApplication {

	public static void main(String[] args)  {
		SpringApplication.run(FantasyFootballApiApplication.class, args);
	}

}
