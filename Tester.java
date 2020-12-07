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
        System.out.print(r.next());
    }
}