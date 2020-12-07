import java.security.InvalidParameterException;
import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
    private int start,end,current;
    public Range(int start,  int end){  
        if (start <= end) {
            this.start = start;
            this.end = end;
            this.current = start;
        } else {
            throw new IllegalArgumentException("Start cannot be greater than end.");
        }
        
    }
    public void reset(){
        this.current = this.start;
    }
    public int length(){  
        return this.end - this.start + 1;
    }
    public boolean hasNext(){ 
        return this.current <= this.end;
    }

    //@throws NoSuchElementException
    public int next() {
        if (hasNext()) {
            int cur = this.current;
            this.current++;
            return cur;
        }
        else throw new NoSuchElementException();
    }
}