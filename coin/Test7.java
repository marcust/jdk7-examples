// Coins R small change ;)

import java.util.*;

public class Test7 {

    private final static Set<Integer> primes = { 2, 7, 31, 127, 8191, 131071, 524287 };
    private final static Map<String, Integer> wordCounter = new HashMap<>();
    private final static Integer oneMillionDollar = 1_000_000;
    private final static byte aByte = (byte)0b00100001;

    public static void main( String... args ) {
        try (BufferedReader br = new BufferedReader(new FileReader(args[0])) {
                @Nonnull String foo = "bar";
                handleLine( br.readLine() );
            }
        }

        private static void handleLine( final String line ) {
                switch (line) {
                case "foo": foo(); break;
                case "bar": bar(); break;
                }
            }

        private static void foo() {
            wordCounter["foo"] = wordCounter["foo"] == null ? 1 : wordCounter["foo"] + 1;
        }

        private static void bar() {
            wordCounter["bar"] = wordCounter["bar"] == null ? 1 : wordCounter["bar"] + 1;
        }

    }
}
