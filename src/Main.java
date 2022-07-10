public class Main {
    public static void main(String[] args) {
        GryffindorStudent harry = new GryffindorStudent("Гарри Поттер", 50, 70, 90, 85, 90);
        GryffindorStudent germiona = new GryffindorStudent("Гермиона Грейнджер", 85, 75, 50, 90, 40);
        GryffindorStudent ron = new GryffindorStudent("Рон Уизли", 20, 60, 45, 95, 10);
        harry.print();
        germiona.print();
        ron.print();


        SlytherinStudent drako = new SlytherinStudent("Драко Малфой", 90, 65, 100, 90, 95, 75, 100);
        SlytherinStudent graham = new SlytherinStudent("Грэхэм Монтегю", 55, 35, 65, 70, 75, 80, 35);
        SlytherinStudent gregory = new SlytherinStudent("Грегори Гойл", 65, 70, 55, 75, 20, 45, 65);
        drako.print();
        graham.print();
        gregory.print();
        drako.compareHogwarts(graham);


        HufflepuffStudent zahariya = new HufflepuffStudent("Захария Смит", 75, 70, 10, 0, 0);
        HufflepuffStudent cedrick = new HufflepuffStudent("Седрик Диггори", 90, 85, 90, 90, 75);
        HufflepuffStudent justin = new HufflepuffStudent("Джастин Финч-Флетчли", 70, 50, 65, 55, 50);
        zahariya.print();
        cedrick.print();
        justin.print();
        justin.compareHogwarts(harry);
        RavenclawStudent chjoe = new RavenclawStudent("Чжоу Чанг", 75, 60, 80, 75, 50);
        RavenclawStudent padma = new RavenclawStudent("Падма Патил", 85, 80, 50, 65, 40);
        RavenclawStudent marcus = new RavenclawStudent("Маркус Белби", 20, 15, 35, 15, 10);
        chjoe.print();
        padma.print();
        marcus.print();

    }

}
