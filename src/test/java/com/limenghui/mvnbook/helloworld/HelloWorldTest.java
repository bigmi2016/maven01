package com.limenghui.mvnbook.helloworld;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest{
    @Test
    public void testSayHello(){
		HelloWorld helloWorld = new HelloWorld();
		String result = helloWorld.sayHello();
	    assertEquals("Hello Maven",result);
	}
}