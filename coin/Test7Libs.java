// Coins R small change ;)

import java.lang.Objects;
import java.util.*;
import java.nio.file.*;
import java.lang.ReflectiveOperationException;

public class Test7Libs {


    public static void main( String... args ) {
        objectsUtilityClass();

        nioFile();
   
    }

    private static void objectsUtilityClass() {
        Object foo = null;

        Object bar = Objects.nonNull( foo ); // throws Null Pointer Exception

        int hashCode = Objects.hash( foo, bar ); // varargs hash code generator

        final String baz = Objects.toString( foo, "Default" );

        final boolean areEqual = Objects.equals( foo, null ); // true

    }

    private static void nioFile() {

    }

}
