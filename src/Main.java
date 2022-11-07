public class Main {
    public static void main(String[] args) {
        Car car1 =new Car();
        car1.setName("Camry");
        car1.setYldamdygy(280);
        car1.setKompanya("Toyota");

        Car car2 =new Car();
        car2.setName("Audi");
        car2.setYldamdygy(150);
        car2.setKompanya("Volkswagen");

        Car car3 =new Car();
        car3.setName("M-6");
        car3.setYldamdygy(300);
        car3.setKompanya("BMW");

        Car[] cars={car1,car2,car3};
        for (Car car:cars) {
            System.out.println(car1.getName()+"\n"+car2.getName()+"\n"+car3.getName());
            System.out.println(car1.getYldamdygy()+"\n"+car2.getYldamdygy()+"\n"+car3.getYldamdygy());
            System.out.println(car1.getKompanya()+"\n"+car2.getKompanya()+"\n"+car3.getKompanya());

            Person person1=new Person();
            person1.setName("Askarbekova Kanykei");
            person1.setAge(19);
            person1.setGroup("Java-8");

            Person person2=new Person();
            person2.setName("Toktosunova Aiperi");
            person2.setAge(18);
            person2.setGroup("Java-7");

            Person person3=new Person();
            person3.setName("Myrzakanova Aruuke");
            person3.setAge(20);
            person3.setGroup("Java Script");

            Person[] people={person1,person2,person3};
            for (Person person:people) {
                System.out.println(person1.getName()+"\n"+person2.getName()+"\n"+person3.getName());
                System.out.println(person1.getAge()+"\n"+person2.getAge()+"\n"+person3.getAge());
                System.out.println(person1.getGroup()+"\n"+person2.getGroup()+"\n"+person3.getGroup());

            School school1=new School();
            school1.setName("Toktogul Satylganov");
            school1.setAdress("");

          }





        }
    }
}