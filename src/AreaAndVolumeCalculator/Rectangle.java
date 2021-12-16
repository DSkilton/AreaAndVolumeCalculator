package AreaAndVolumeCalculator;

/**
 *
 * @author Duncan
 */
public class Rectangle extends DataStore implements Shape{
    private double length;
    private double width;
    
    public Rectangle(){
        setShapeName();
    }
    
    public double getLength(){
        return length; 
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double calculateArea(){
        return this.length * this.width;
    }
    
//    @Override
//    public String getShapeName() {
//        if(shapeName == null){
//            setShapeName();
//        }
//        return shapeName;
//    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }

    
    
}
