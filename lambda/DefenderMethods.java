public class DefenderMethods {

    public interface DefenderInterface {
        
        public int compute( int x, int y );

        extension String defender( String argument )
          default DefenderMethods.defaultImplementation;

    }

    public static String defaultImplementation( DefenderInterface value, String argument ) {
        return argument + " DEFAULT ";
    }

    public String doSomething( DefenderInterface argument ) {
        System.out.println( argument.compute( 20, 10 ) );
        return argument.defender( "foo" );
    }

    public static void main( String... args ) {

        final DefenderMethods methods = new DefenderMethods();

        // Does not convert to implentation of DefenderInterface (?)
        //System.out.println( methods.doSomething( #(int x,int y){ x * y } ) );

        final DefenderInterface implementation = new DefenderInterface() {
                
                public int compute( int x, int y ) {
                    return x + y;
                }

         };

        // Does give an abstract method error AbstractMethodError: DefenderMethods$1.defender(Ljava/lang/String;)Ljava/lang/String;
        //System.out.println( methods.doSomething( implementation ) );

        final DefenderInterface completeImplementation = new DefenderInterface() {
                
                public int compute( int x, int y ) {
                    return x + y;
                }

                public String defender( String argument ) {
                    return "bar";
                }

         };

        System.out.println( methods.doSomething( completeImplementation ) );

    }


}
