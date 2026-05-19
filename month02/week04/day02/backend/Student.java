package month02.week04.day02.backend;

public class Student {
    String name;
    int[] scores = new int[5];

        public Student(String name, int[] scores){
            this.name = name;
            this.scores = scores;
        }

        double average(){
            double avg = 0;
            for(int i = 0; i < scores.length; i++){
                avg += scores[i];
            }
            return (double) avg / scores.length;
        }
        double gpa(){
            if (average() == 100){
                return 5.0;
            } else if (average() >= 90) {
                return 4.0;
            } else if(average() >= 80){
                return 3.0;
            } else if(average() >= 70){
                return 2.0;
            } else {
                return 1.0;
            }
        }
        String grade(){
            String result = "";
            for(int i = 0; i < scores.length; i++) {
                if (scores[i] >= 90) {
                    result += scores[i] + " grade is A\n";
                } else if(scores[i] >= 80) {
                    result += scores[i] + " grade is B\n";
                } else if(scores[i] >= 70){
                    result += scores[i] + " grade is C\n";
                } else if(scores[i] >= 60){
                    result += scores[i] + " grade is D\n";
                } else{
                    result += scores[i] + " grade is F\n";
                }
            }
            return result;
        }
        void showReport(){
            System.out.println("Your name: " + name + ", Your average: " + average() + ", Your gpa: " + gpa());
            System.out.println("Your Grades: \n" + grade());
        }
}
