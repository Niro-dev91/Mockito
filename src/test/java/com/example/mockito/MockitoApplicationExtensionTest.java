package com.example.mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockitoApplicationExtensionTest {

    @Mock
    private NameProvider nameProvider;

    @InjectMocks
    private GreetingService greetingService;

    @Test
    public void testGreeting() {
        when(nameProvider.getName()).thenReturn("Bob");

        String greeting = greetingService.getGreeting();
        assertEquals("Hello, Bob!", greeting);
        verify(nameProvider).getName();
    }
}
