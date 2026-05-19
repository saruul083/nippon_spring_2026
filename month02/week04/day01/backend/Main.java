
public class Main {
    public static void main(String[] args) {
        Human Khangaikhuu = new Human();
        
        Khangaikhuu.gender = "Eregtei";
        Khangaikhuu.firstName = "Khangaikhuu";
        Khangaikhuu.lastName = "uvgunkhuu";
        Khangaikhuu.age = 45;
        
        // System.out.println(Khangaikhuu.age);
        // System.out.println(Khangaikhuu.firstName);
        // System.out.println(Khangaikhuu.lastName);
        // System.out.println(Khangaikhuu.gender);

        Animal Cat = new Animal();

        Cat.age = 3;
        Cat.gender = "female";
        Cat.turul = "Mamal";

        // System.out.println(Cat.turul);
        // System.out.println(Cat.gender);
        // System.out.println(Cat.age);

        // Child myChild = new Child("Saruulbilegt", 23);
        // System.out.println(myChild.age);
        // System.out.println(myChild.name);

        Student firstStudent = new Student(13, "Uchralbileg", 3.4);
        // System.out.println(firstStudent.age);
        // System.out.println(firstStudent.name);
        // System.out.println(firstStudent.gpa);

        firstStudent.printHello();
        firstStudent.introduceMyself();
        System.out.println(firstStudent.nextYear());
    }
}
