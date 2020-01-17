package root;

public class LevelCImpl implements LevelC {
    int level;

    public LevelCImpl(int lvlC) {
        level = lvlC;
    }

    @Override
    public float getLevelC() {
        return level;
    }

    @Override
    public float consumateLevelC(float toConsume) {
        return (level -= (toConsume));
    }
}
