package AreaAndVolumeCalculator;

/**
 *
 * @author Duncan
 */
public class Square extends Rectangle implements Shape{
    private String shapeName = null; 
    
    @Override
    public void addToList(String shapeName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getShapeName() {
        return shapeName;
    }
    
    @Override
    public void setShapeName() {
        String shapeName = "Square";
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
