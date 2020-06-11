package com.mySite.appli1.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class ConsolService implements CommandLineRunner {
@Override
public void run(String... args) throws Exception {
System.out.println("I am a spring console app !");
}
}