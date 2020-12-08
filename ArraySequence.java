import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
    private int currentIndex;
    private int []data;

    public boolean hasNext() {
        return this.currentIndex >= 0 && this.currentIndex <= length();
    }

    public int length() {
        return data.length;
    }

    public void reset() {
        this.currentIndex =  0;    
    }

    public int next() {
        if (hasNext()) {
            int cur = this.currentIndex;
            this.currentIndex++;
            return cur;
        }
        else throw new NoSuchElementException();
    }
    /*Construct the sequence by copying values from the other array into the data array*/
    public ArraySequence(int [] other){  
        int[] data = new int[other.length];
        for (int i = 0; i < data.length; i++) {
            data[i] = other[i];
        }
    }
}