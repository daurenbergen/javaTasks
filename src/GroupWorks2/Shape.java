package GroupWorks2;

public interface Shape {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
     Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
      Test your code.
     */

        double calculateArea();
        double calculatePerimeter();
    }

    class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return 3.14 * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * 3.14 * radius;
        }
    }

    class Square implements Shape {
        private double sideLength;

        public Square(double sideLength) {
            this.sideLength = sideLength;
        }

        @Override
        public double calculateArea() {
            return sideLength * sideLength;
        }

        @Override
        public double calculatePerimeter() {
            return 4 * sideLength;
        }
    }


