public class Hogwarts {
    private String name;
    private int magic;
    private int transgression;

    public Hogwarts(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
    @Override public String toString() {
        return String.format("Студент %s; сила магии: %d; сила трансгрессии: %d",name,magic,transgression);
    }
    public void print(){
        System.out.println(this.toString());
    }
    public void compareHogwarts(HogwartsSt)

}