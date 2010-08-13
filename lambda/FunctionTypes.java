public class FunctionTypes {

    public String resolver( final String value, final #String(String) function ) {
        return function.( value );
    }

    public static void main( String... args ) {
        final FunctionTypes t = new FunctionTypes();

        final #String(String) function = #(x){ x + "bar" };

        System.out.println( function( "foo" ) );

        System.out.println( resolver.resolve( "Foo", #(x){ x + "bar" } ) );

        System.out.println( resolver.resolve( "Foo", function ) );
                            
    }

}
