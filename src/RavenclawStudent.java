public class Ravenclaw extends HogwartsStudent {
    private int smart;
    private int wisdom;
    private int fullOfCreativity;

    public Ravenclaw(String name, int magic, int transgression, int smart, int wisdom, int fullOfCreativity) {
        super(name, magic, transgression);
        this.smart = smart;
        this.wisdom = wisdom;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }
    @Override public String toString() {
        return String.format("Студент %s; сила магии: %d; сила трансгрессии: %d",super.toString(),smart,wisdom,fullOfCreativity);
    }
}
