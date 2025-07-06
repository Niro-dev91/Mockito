package com.example.mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MockitoApplicationOpenMockTests {

    @Mock
    private NameProvider nameProvider;

    @InjectMocks
    private GreetingService greetingService;

    // Initialize the mocks manually
    @BeforeEach
    void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGreeting(){
        when(nameProvider.getName()).thenReturn("Alice");

        String result = greetingService.getGreeting();

        assertEquals("Hello, Alice!", result);

        verify(nameProvider).getName();
    }

}
