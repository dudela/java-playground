package com.devcon.sample;

public class SwitchExpressionDemo {

    //Traditional switch case statement
    private static String getValueTraditional(int number) {
        String result;
        switch (number) {
            case 1:
            case 2:
                result = "one or two";
                break;
            case 3:
                result = "three";
                break;
            case 4,5,6:
                result = "four or five or six";
                break;
            default:
                result = "unknown";
        }
        return result;
    }


    //switch case expression Java 13
    private static String getValueViaYield(int number) {
        return switch (number) {
            case 1,2:
                yield "one or two";
            case 3:
                yield "three";
            case 4,5,6:
                // do something here...
                System.out.println("Supports multi line block!");
                yield "four or five or six";
            default:
                yield "unknown";
        };
    }

    //switch case expression Java 14
    private static String getValue(int number) {
        return switch (number) {
            case 1, 2 -> "one or two";
            case 3 -> "three";
            case 4, 5, 6 -> "four or five or six";
            default -> "unknown";
        };
    }
}
