package root;

public class LevelNImpl implements LevelN {
    private float level;

    public LevelNImpl(int i) {
        level = i;
    }

    @Override
    public float getLevelN() {
        return level;
    }


    @Override
    public float consumateLevelN(float toConsume) {
        return (level-=toConsume);
    }
}
