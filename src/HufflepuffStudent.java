public class HufflepuffStudent extends HogwartsStudent {
    private int hardworking;
    private int loyality;
    private int honesty;

    public HufflepuffStudent(String name, int magic, int transgression, int hardworking, int loyality, int honesty) {
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

    @Override
    public String toString() {
        return String.format("Студент %s; сила магии: %d; сила трансгрессии: %d", super.toString(), hardworking, loyality, honesty);
    }

    private int ability() {
        return hardworking + loyality + honesty;
    }

    public void compareHogwarts(HufflepuffStudent hufflepuffStudent) {
        int ability1 = this.ability();
        int ability2 = hufflepuffStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %s : %d VS %d%n", getName(), hufflepuffStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше, чем студент %s : %d VS %d%n", hufflepuffStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент %s такой же, как студент %s : %d VS %d%n", hufflepuffStudent.getName(), getName(), ability1, ability2);
        }
    }
}
