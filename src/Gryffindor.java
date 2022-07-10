class GryffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honour;

    private int bravery;

    public GryffindorStudent(String name, int magic, int transgression, int nobility, int honour, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return String.format("Студент %s; сила магии: %d; сила трансгрессии: %d", super.toString(), nobility, honour, bravery);
    }

    private int ability() {
        return nobility + honour + bravery;
    }

    public void compareHogwarts(GryffindorStudent gryffindorStudent) {
        int ability1 = this.ability();
        int ability2 = gryffindorStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %s : %d VS %d%n", getName(), gryffindorStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше, чем студент %s : %d VS %d%n", gryffindorStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент %s такой же, как студент %s : %d VS %d%n", gryffindorStudent.getName(), getName(), ability1, ability2);
        }
    }
}
