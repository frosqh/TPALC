package root;

public class LevelNImpl implements LevelN {
    private float level;

    public LevelNImpl(int i) {
        level = i;
    }

    @Override
    public float getLevel() {
        return level;
    }


    @Override
    public float consumateLevel(float toConsume) {
        return (level-=toConsume);
    }
}
