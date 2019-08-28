class Example2{

    public static void main(String args[]){

        Person p1 = new Person("Noah",27);
        Person p2 = new Person("Troy",30);
        Employee e1 = new Employee(8572340,"Myk",37);
        Employee e2 = new Employee(4000, "Kaite",35);
        Animal a1 = new Animal("Crocodile");
        Animal a2 = new Animal("Gorilla");
        Bonus b1 = new Bonus("a million dollars");

        System.out.println(p1.getName() + " " + p1.getAge());

        System.out.println(e1.getName() + " " + e1.getAge() + " " + e1.getSalary());

        System.out.println(a1.getName() + " attacks " + p1.getName());

        System.out.println(e1.getName() + " receives " + b1.getName() + " plus " + e1.getSalary());

        System.out.println(p2.getName() + " attacks " +p1.getName());

        System.out.println(a2.getName() + " attacks " +p2.getName() +);

        System.out.println(e2.getName() + " receives a salary of " + e2.getSalary() + " with a bonus of " + b1.getName());
}

}