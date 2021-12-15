package AreaAndVolumeCalculator;

/**
 *
 * @author Duncan
 */
public class Square extends Rectangle implements Shape{
    
    public double calculateArea(){
        return super.calculateArea();
    }
    
    public void setWidth(double width){
        super.setLength(width);
        super.setWidth(width);
    }
    
    public void setLength(double length){
        super.setLength(length);
        super.setWidth(length);
    }
}
