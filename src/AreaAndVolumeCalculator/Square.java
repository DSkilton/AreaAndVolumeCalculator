package AreaAndVolumeCalculator;

/**
 *
 * @author Duncan
 */
public class Square extends Rectangle implements Shape{
    private String shapeName = null; 
    
    public Square(){
        setShapeName();
    }
    
    @Override
    public void setShapeName() {
        String shapeName = "Square";
        addToList(shapeName);
    }
    
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
