package root;

public class Cart implements LevelC, LevelN {

    LevelN lvlN;
    LevelC lvlC;


    public Cart(int lvlN, int lvlC){
        this.lvlN = new LevelNImpl(lvlN);
        this.lvlC = new LevelCImpl(lvlC);
    }

    @Override
    public float getLevelC() {
        return lvlC.getLevelC();
    }

    @Override
    public float consumateLevelC(float toConsume) {
        return lvlC.consumateLevelC(toConsume);
    }

    @Override
    public float getLevelN() {
        return lvlN.getLevelN();
    }

    @Override
    public float consumateLevelN(float toConsume) {
        return lvlN.consumateLevelN(toConsume);
    }
}
