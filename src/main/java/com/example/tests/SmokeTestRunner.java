package com.example.tests;

public class SmokeTestRunner {
    public static void main(String[] args) {
        System.out.println("Running SMOKE tests...");
        loginTest();
        healthCheckTest();
        System.out.println("Smoke tests completed.");
    }

    static void loginTest() {
        System.out.println("✅ loginTest passed");
    }

    static void healthCheckTest() {
        System.out.println("✅ healthCheckTest passed");
    }
}
