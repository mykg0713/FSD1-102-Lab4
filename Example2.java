class Example2{

    public static void main(String args[]){

        Person p1 = new Person("Noah",27);
        Employee e1 = new Employee(8572340,"Myk",37);
        Animal a1 = new Animal("Crocodile");
        Animal a2 = new Animal("Gorilla");
        Bonus b1 = new Bonus("a million dollars");

        System.out.println(p1.getName() + " " + p1.getAge());

        System.out.println(e1.getName() + " " + e1.getAge() + " " + e1.getSalary());

        System.out.println(a1.getName() + " attacks " + p1.getName());

        System.out.println(e1.getName() + " receives " + b1.getName() + " plus " + e1.getSalary());

        System.out.println(a2.getName() + " attacks " +p1.getName());
}

}