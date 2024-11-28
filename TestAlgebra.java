import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class TestAlgebra {
    private static int totalTests = 0;
    private static int passedTests = 0;

    public static void main(String[] args) {
        testPlus();
        testMinus();
        testTimes();
        testPow();
        testDiv();
        testMod();
        testSqrt();
        testForbiddenOperators();
        
        System.out.println("\nTotal tests: " + totalTests);
        System.out.println("Passed tests: " + passedTests);
        System.out.println("Success rate: " + (passedTests * 100.0 / totalTests) + "%");
    }

    private static int testPlus() {
        System.out.println("\nTesting plus operations:");
        totalTests += 6;
        
        boolean test1 = Algebra.plus(2, 3) == 5;
        System.out.println("Test 1 (basic addition): " + (test1 ? "PASS" : "FAIL"));
        
        boolean test2 = Algebra.plus(0, 0) == 0;
        System.out.println("Test 2 (zero addition): " + (test2 ? "PASS" : "FAIL"));
        
        boolean test3 = Algebra.plus(-1, 1) == 0;
        System.out.println("Test 3 (negative numbers): " + (test3 ? "PASS" : "FAIL"));
        
        boolean test4 = Algebra.plus(100, 200) == 300;
        System.out.println("Test 4 (large numbers): " + (test4 ? "PASS" : "FAIL"));
        
        boolean test5 = Algebra.plus(-5, -3) == -8;
        System.out.println("Test 5 (negative result): " + (test5 ? "PASS" : "FAIL"));
        
        boolean test6 = Algebra.plus(Integer.MAX_VALUE - 1, 1) == Integer.MAX_VALUE;
        System.out.println("Test 6 (max value): " + (test6 ? "PASS" : "FAIL"));

        int passed = (test1 ? 1 : 0) + (test2 ? 1 : 0) + (test3 ? 1 : 0) + 
                    (test4 ? 1 : 0) + (test5 ? 1 : 0) + (test6 ? 1 : 0);
        passedTests += passed;
        return passed;
    }

    private static int testMinus() {
        System.out.println("\nTesting minus operations:");
        totalTests += 6;
        
        boolean test1 = Algebra.minus(7, 2) == 5;
        System.out.println("Test 1 (basic subtraction): " + (test1 ? "PASS" : "FAIL"));
        
        boolean test2 = Algebra.minus(2, 7) == -5;
        System.out.println("Test 2 (negative result): " + (test2 ? "PASS" : "FAIL"));
        
        boolean test3 = Algebra.minus(0, 0) == 0;
        System.out.println("Test 3 (zero subtraction): " + (test3 ? "PASS" : "FAIL"));
        
        boolean test4 = Algebra.minus(100, 50) == 50;
        System.out.println("Test 4 (large numbers): " + (test4 ? "PASS" : "FAIL"));
        
        boolean test5 = Algebra.minus(-5, -3) == -2;
        System.out.println("Test 5 (negative numbers): " + (test5 ? "PASS" : "FAIL"));
        
        boolean test6 = Algebra.minus(Integer.MIN_VALUE + 1, 1) == Integer.MIN_VALUE;
        System.out.println("Test 6 (min value): " + (test6 ? "PASS" : "FAIL"));

        int passed = (test1 ? 1 : 0) + (test2 ? 1 : 0) + (test3 ? 1 : 0) + 
                    (test4 ? 1 : 0) + (test5 ? 1 : 0) + (test6 ? 1 : 0);
        passedTests += passed;
        return passed;
    }

    private static int testTimes() {
        System.out.println("\nTesting times operations:");
        totalTests += 6;
        
        boolean test1 = Algebra.times(3, 4) == 12;
        System.out.println("Test 1 (basic multiplication): " + (test1 ? "PASS" : "FAIL"));
        
        boolean test2 = Algebra.times(0, 5) == 0;
        System.out.println("Test 2 (multiply by zero): " + (test2 ? "PASS" : "FAIL"));
        
        boolean test3 = Algebra.times(-2, 3) == -6;
        System.out.println("Test 3 (negative number): " + (test3 ? "PASS" : "FAIL"));
        
        boolean test4 = Algebra.times(-2, -3) == 6;
        System.out.println("Test 4 (negative numbers): " + (test4 ? "PASS" : "FAIL"));
        
        boolean test5 = Algebra.times(100, 0) == 0;
        System.out.println("Test 5 (large number by zero): " + (test5 ? "PASS" : "FAIL"));
        
        boolean test6 = Algebra.times(1, 1) == 1;
        System.out.println("Test 6 (identity): " + (test6 ? "PASS" : "FAIL"));

        int passed = (test1 ? 1 : 0) + (test2 ? 1 : 0) + (test3 ? 1 : 0) + 
                    (test4 ? 1 : 0) + (test5 ? 1 : 0) + (test6 ? 1 : 0);
        passedTests += passed;
        return passed;
    }

    private static int testPow() {
        System.out.println("\nTesting power operations:");
        totalTests += 6;
        
        boolean test1 = Algebra.pow(5, 3) == 125;
        System.out.println("Test 1 (basic power): " + (test1 ? "PASS" : "FAIL"));
        
        boolean test2 = Algebra.pow(2, 0) == 1;
        System.out.println("Test 2 (zero exponent): " + (test2 ? "PASS" : "FAIL"));
        
        boolean test3 = Algebra.pow(0, 5) == 0;
        System.out.println("Test 3 (zero base): " + (test3 ? "PASS" : "FAIL"));
        
        boolean test4 = Algebra.pow(1, 10) == 1;
        System.out.println("Test 4 (identity): " + (test4 ? "PASS" : "FAIL"));
        
        boolean test5 = Algebra.pow(2, 4) == 16;
        System.out.println("Test 5 (power of 2): " + (test5 ? "PASS" : "FAIL"));
        
        boolean test6 = Algebra.pow(-2, 3) == -8;
        System.out.println("Test 6 (negative base): " + (test6 ? "PASS" : "FAIL"));

        int passed = (test1 ? 1 : 0) + (test2 ? 1 : 0) + (test3 ? 1 : 0) + 
                    (test4 ? 1 : 0) + (test5 ? 1 : 0) + (test6 ? 1 : 0);
        passedTests += passed;
        return passed;
    }

    private static int testDiv() {
        System.out.println("\nTesting division operations:");
        totalTests += 6;
        
        boolean test1 = Algebra.div(12, 3) == 4;
        System.out.println("Test 1 (basic division): " + (test1 ? "PASS" : "FAIL"));
        
        boolean test2 = Algebra.div(25, 7) == 3;
        System.out.println("Test 2 (integer division): " + (test2 ? "PASS" : "FAIL"));
        
        boolean test3 = Algebra.div(0, 5) == 0;
        System.out.println("Test 3 (zero dividend): " + (test3 ? "PASS" : "FAIL"));
        
        boolean test4 = Algebra.div(100, 10) == 10;
        System.out.println("Test 4 (large numbers): " + (test4 ? "PASS" : "FAIL"));
        
        boolean test5 = Algebra.div(-15, 3) == -5;
        System.out.println("Test 5 (negative dividend): " + (test5 ? "PASS" : "FAIL"));
        
        boolean test6 = Algebra.div(-15, -3) == 5;
        System.out.println("Test 6 (negative numbers): " + (test6 ? "PASS" : "FAIL"));

        int passed = (test1 ? 1 : 0) + (test2 ? 1 : 0) + (test3 ? 1 : 0) + 
                    (test4 ? 1 : 0) + (test5 ? 1 : 0) + (test6 ? 1 : 0);
        passedTests += passed;
        return passed;
    }

    private static int testMod() {
        System.out.println("\nTesting modulo operations:");
        totalTests += 6;
        
        boolean test1 = Algebra.mod(25, 7) == 4;
        System.out.println("Test 1 (basic modulo): " + (test1 ? "PASS" : "FAIL"));
        
        boolean test2 = Algebra.mod(120, 6) == 0;
        System.out.println("Test 2 (no remainder): " + (test2 ? "PASS" : "FAIL"));
        
        boolean test3 = Algebra.mod(0, 5) == 0;
        System.out.println("Test 3 (zero dividend): " + (test3 ? "PASS" : "FAIL"));
        
        boolean test4 = Algebra.mod(7, 3) == 1;
        System.out.println("Test 4 (small numbers): " + (test4 ? "PASS" : "FAIL"));
        
        boolean test5 = Algebra.mod(17, 5) == 2;
        System.out.println("Test 5 (larger numbers): " + (test5 ? "PASS" : "FAIL"));
        
        boolean test6 = Algebra.mod(100, 10) == 0;
        System.out.println("Test 6 (divisible): " + (test6 ? "PASS" : "FAIL"));

        int passed = (test1 ? 1 : 0) + (test2 ? 1 : 0) + (test3 ? 1 : 0) + 
                    (test4 ? 1 : 0) + (test5 ? 1 : 0) + (test6 ? 1 : 0);
        passedTests += passed;
        return passed;
    }

    private static int testSqrt() {
        System.out.println("\nTesting square root operations:");
        totalTests += 6;
        
        boolean test1 = Algebra.sqrt(36) == 6;
        System.out.println("Test 1 (perfect square): " + (test1 ? "PASS" : "FAIL"));
        
        boolean test2 = Algebra.sqrt(0) == 0;
        System.out.println("Test 2 (zero): " + (test2 ? "PASS" : "FAIL"));
        
        boolean test3 = Algebra.sqrt(1) == 1;
        System.out.println("Test 3 (one): " + (test3 ? "PASS" : "FAIL"));
        
        boolean test4 = Algebra.sqrt(263169) == 513;
        System.out.println("Test 4 (large perfect square): " + (test4 ? "PASS" : "FAIL"));
        
        boolean test5 = Algebra.sqrt(76123) == 275;
        System.out.println("Test 5 (floor value): " + (test5 ? "PASS" : "FAIL"));
        
        boolean test6 = Algebra.sqrt(10000) == 100;
        System.out.println("Test 6 (power of 10): " + (test6 ? "PASS" : "FAIL"));

        int passed = (test1 ? 1 : 0) + (test2 ? 1 : 0) + (test3 ? 1 : 0) + 
                    (test4 ? 1 : 0) + (test5 ? 1 : 0) + (test6 ? 1 : 0);
        passedTests += passed;
        return passed;
    }

    private static int testForbiddenOperators() {
        System.out.println("\nTesting forbidden operators:");
        totalTests += 1;
        
        try {

            String algebraCode = new String(Files.readAllBytes(Paths.get("Algebra.java")));
            algebraCode = algebraCode.replaceAll("\".*\"", "")
                    .replaceAll("/\\*.*?\\*/", "")
                    .replaceAll("//.*", "");

            String[] forbidden = {
                "\\+[^+]", "-[^-]", "\\*", "/", "%", "Math\\.pow", "Math\\.sqrt"
            };

            for (String operator : forbidden) {
                if (algebraCode.matches(".*" + operator + ".*")) {
                    System.out.println("Test 1 (no forbidden operators): FAIL");
                    System.out.println("Found forbidden operator matching: " + operator);
                    return 0;
                }
            }
            System.out.println("Test 1 (no forbidden operators): PASS");
            passedTests += 1;
            return 1;
        } catch (IOException e) {
            System.out.println("Test 1 (no forbidden operators): FAIL");
            System.out.println("Could not read Algebra.java");
            return 0;
        }
    }
}
