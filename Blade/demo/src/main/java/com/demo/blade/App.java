package com.demo.blade;

import com.blade.Blade;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Blade.of().get("landingPage", ctx -> ctx.text("App Loaded. Well Hello World!")).start();
    }
}
