public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter(){
        if (this.length==0||this.width==0){
            return 0.0;
        }
        else{
            return 2 * (length+width);
        }
    }
} 