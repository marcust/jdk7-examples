public class SAM {

    private interface SAMInterface {

        public int compute( int x, int y );

    }

    public String withSAMClass( final SAMClass argument ) {
        return argument.doSomething( "foo" );
    }

    public int withSAMInterface( final SAMInterface argument ) {
        return argument.compute( 10, 20 );
    }

    public String withComplexSAMClass( final ComplexSAMClass argument ) {
        return argument.doSomething( "foo" );
    }

    public static void main( final String... args ) {
        final SAM sam = new SAM();

        System.out.println( sam.withSAMInterface( #(x,y){ x * y } ) );

        System.out.println( sam.withSAMInterface( #(x,y){ x + y } ) );

        // class file for com.sun.runtime.ProxyHelper not found
        //System.out.println( sam.withSAMInterface( java.lang.Math#max ) );
        
        System.out.println( sam.withSAMClass( #(String x){ return x + "bar"; }  ) );

        System.out.println( sam.withComplexSAMClass( #(String x){ return x + "bar"; }  ) );
        
    }

}


