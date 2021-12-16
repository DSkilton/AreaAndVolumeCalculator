package AreaAndVolumeCalculator;

/**
 *
 * @author Duncan
 */
public class Circle extends DataStore implements Shape{
    private final double PI = 3.14;
    private double radius;
    private String shapeName= null;
    
    public Circle(){
        setShapeName();
    }
    
    @Override
    public double calculateArea(){
        return PI * radius * radius;
    }
    
//        @Override
//    public String getShapeName() {
//        if(shapeName == null){
//            setShapeName();
//        }        
//        return shapeName;
//    }
}
