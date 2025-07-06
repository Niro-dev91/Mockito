package com.example.mockito;

public class GreetingService {

    private final NameProvider nameProvider;

    public GreetingService(NameProvider nameProvider) {
        this.nameProvider = nameProvider;
    }

    public String getGreeting() {
        String name = nameProvider.getName();
        return "Hello, " + name + "!";
    }

}
