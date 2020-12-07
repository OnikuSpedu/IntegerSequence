import java.util.NoSuchElementException;

public class Tester {
    public static void main(String[] args) {
        IntegerSequence r = new Range(10,20);
        System.out.println("Length: " + r.length());
        while(r.hasNext()){
        System.out.print(r.next());
        if( r.hasNext() )       
            System.out.print( ", " );
        }
        System.out.println();
        r.reset();
        while(r.hasNext()){
            System.out.print(r.next());
            if( r.hasNext() )       
                System.out.print( ", " );
            }
        System.out.println();
        try {
            System.out.print(r.next());
        } catch(NoSuchElementException e){
            e.printStackTrace();
        }
        try {
            IntegerSequence illegalRange = new Range(100,20);
        } catch(IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}