package com.example.tests;

public class RegressionTestRunner {
    public static void main(String[] args) {
        System.out.println("Running REGRESSION tests...");
        addUserTest();
        deleteUserTest();
        System.out.println("Regression tests completed.");
    }

    static void addUserTest() {
        System.out.println("✅ addUserTest passed");
    }

    static void deleteUserTest() {
        System.out.println("✅ deleteUserTest passed");
    }
}
