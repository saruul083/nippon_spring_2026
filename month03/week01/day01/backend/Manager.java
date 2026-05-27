package month03.week01.day01.backend;

public class Manager extends Employee{
    int teamSize;

    Manager(String name, int age, String comapny, double salary, int teamSize){
        super(name, age, comapny, salary);
        this.teamSize = teamSize;
    }

    void manage() {
        System.out.println(teamSize + " hunii bagiig udirdaj bna");
    }
    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Teamsize: " + teamSize);
    }
}
