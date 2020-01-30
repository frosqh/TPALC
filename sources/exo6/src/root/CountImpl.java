package root;

public class CountImpl implements Count {
    private int count;

    public CountImpl(){
        this(100);
    }

    public CountImpl(int i) {
        count = i;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public int consume(int c) {
        return (count -= c);
    }
}
