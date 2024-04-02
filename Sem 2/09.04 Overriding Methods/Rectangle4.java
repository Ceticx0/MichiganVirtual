// Gavin Perry, 2024-3-22, Defines rectangle class with a length and width.
public class Rectangle4{
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle4(int length, int width){
        // initialize instance variables
        this.length = length;
        this.width = width;
    }

    // return the height
    public int getLength(){
        return this.length;
    }

    // return the width
    public int getWidth(){
        return this.width;
    }

    // String to display when object is printed.
    public String toString(){
        return "Rectangle: " + this.length + " X " + this.width;
    }
    
    public boolean equals(Rectangle4 rect){
        return (getLength() == rect.getLength() && getWidth() == rect.getWidth());
    }
}