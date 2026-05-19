package month02.week04.day02.backend;

public class Rectangle {
        double width;
        double height;

        public Rectangle(double width, double height){
            this.width = width;
            this.height = height;
        }

        double area(){
            return width * height;
        }
        double perimeter(){
            return 2 * (width + height);
        }
        boolean isSquare(){
            return width == height;
        }
        void showInfo(){
            System.out.println("Rectangle: " + width + " x " + height + ", Taibai: " + area() + ", Perimeter: "
                    + perimeter() + ", Square: " + isSquare());
        }
}
