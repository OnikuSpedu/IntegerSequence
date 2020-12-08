import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{

    private int currentIndex;
    private int[] data;

    /*Construct the sequence by copying values from the other array into the data array*/
    public ArraySequence(int[] other){  
        this.data = new int[other.length];
        for (int i = 0; i < data.length; i++) {
            data[i] = other[i];
        }
    }
    public ArraySequence(IntegerSequence otherseq){
        this.data = new int[otherseq.length()];

        for (int i = 0; i < data.length(); i++) {
            if(otherseq.hasNext()) {
                data[i] = otherseq.next();
            } else {
                throw new ArrayIndexOutOfBoundsException("Make sure to reset the array");
            }
        }
        
        otherseq.reset();

    }

    public boolean hasNext() {
        return this.currentIndex >= 0 && this.currentIndex < length();
    }

    public int length() {
        return data.length;
    }

    public void reset() {
        this.currentIndex =  0;    
    }

    public int next() {
        if (hasNext()) {
            int cur = data[this.currentIndex];
            this.currentIndex++;
            return cur;
        }
        else throw new NoSuchElementException();
    }
}