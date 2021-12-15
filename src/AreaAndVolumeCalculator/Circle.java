package AreaAndVolumeCalculator;
import 

/**
 *
 * @author Duncan
 */
public class Circle implements Shape{
    private final double PI = 3.14;
    private double radius;
    private String shapeName= null;
    
    @Override
    public void addToList(String shapeName){
        DataStore.shapeSet.add(getShapeName());
    }
    
    @Override
    public String getShapeName() {
        if(shapeName == null){
            setShapeName();
        }        
        return shapeName;
    }
    
    @Override
    public void setShapeName() {
        String shapeName = "Circle";
        addToList(shapeName);
    }
    
    @Override
    public double calculateArea(){
        return PI * radius * radius;
    }
}
