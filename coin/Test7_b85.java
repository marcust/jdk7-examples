// Coins R small change ;)

import java.util.*;

public class Test7_b85 {

    private final static Map<String, Integer> wordCounter = new HashMap<>();
    private final static Integer oneMillionDollar = 1_000_000;
    private final static byte aByte = (byte)0b00100001;

    public static void main( String... args ) {
        handleLine("foo");
    }

    private static void handleLine( final String line ) {
        switch (line) {
        case "foo": foo(); break;
        case "bar": bar(); break;
        }
    }

    private static void foo() {
        System.out.println("Foo");
    }

    private static void bar() {
        System.out.println("Bar");
    }

}
