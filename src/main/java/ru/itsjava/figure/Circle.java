package ru.itsjava.figure;

public class Circle extends Figure {
        private int radius;

        public Circle(int radius) {
            this.radius = radius;

        }

        public void getArea() {
            super.getArea();
            System.out.print("круга: ");
            System.out.println(PI*(radius*radius));

        }

        public void getPerimetr() {
            super.getPerimetr();
            System.out.print("круга: ");
            System.out.println(2*PI*radius);
        }

    @Override
    void drawTheCircle() {
        System.out.println("C-I-R-C-L-E");
    }
}


