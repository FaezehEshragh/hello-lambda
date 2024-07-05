package dev.esh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloLambdaTest
{

    @Test
    void shouldReturnHelloMessage()
    {
        HelloLambda sut = new HelloLambda();
        assertEquals("Hello Lambda!", sut.handleRequest());
    }
}
