public class Hufflepuff extends HogwartsStudent {
    private int hardworking;
    private int loyality;
    private int honesty;

    public Hufflepuff(String name, int magic, int transgression, int hardworking, int loyality, int honesty) {
        super(name, magic, transgression);
        this.hardworking = hardworking;
        this.loyality = loyality;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyality() {
        return loyality;
    }

    public void setLoyality(int loyality) {
        this.loyality = loyality;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    @Override public String toString() {
        return String.format("Студент %s; сила магии: %d; сила трансгрессии: %d",super.toString(),hardworking,loyality,honesty);
    }
}
