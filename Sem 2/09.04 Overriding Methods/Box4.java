// Gavin Perry, 2024-3-22, Defines Box class which extends the rectangle class and makes the height and width the same, as well as overriding the toString equals methods.
public class Box4 extends Rectangle4{
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box4(int length, int width, int height){
        // call superclass
        super(length, width);

        // initialize instance variables
        this.height = height;
    }

    // return the height
    public int getHeight(){
        return this.height;
    }

    // String to display when object is printed.
    public String toString(){
        return "Box: " + getLength() + " X " + getWidth() + " X " + this.height;
    }
    
    public boolean equals(Box4 box){
        return (getLength() == box.getLength() && getWidth() == box.getWidth() && getHeight() == box.getHeight());
    }
}