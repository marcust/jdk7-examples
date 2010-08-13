

public class Test {

    public static void main( String...args ) {
        

        new Thread( #{ System.out.println("Hello Lambda") } ).start();


    }

}
