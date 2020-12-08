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
        int[]nums = {1,3,5,0,-1,3,9};
        IntegerSequence as = new ArraySequence(nums);

        System.out.println("ArraySequence(array):");
        while(as.hasNext()){
            System.out.print(as.next()+", ");
        }
    }
}