public class RavenclawStudent extends HogwartsStudent {
    private int smart;
    private int wisdom;
    private int fullOfCreativity;

    public RavenclawStudent(String name, int magic, int transgression, int smart, int wisdom, int fullOfCreativity) {
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

    @Override
    public String toString() {
        return String.format("Студент %s; сила магии: %d; сила трансгрессии: %d", super.toString(), smart, wisdom, fullOfCreativity);
    }

    private int ability() {
        return smart + wisdom + fullOfCreativity;
    }

    public void compareHogwarts(RavenclawStudent ravenclawStudent) {
        int ability1 = this.ability();
        int ability2 = ravenclawStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %s : %d VS %d%n", getName(), ravenclawStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше, чем студент %s : %d VS %d%n", ravenclawStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент %s такой же, как студент %s : %d VS %d%n", ravenclawStudent.getName(), getName(), ability1, ability2);
        }
    }
}

