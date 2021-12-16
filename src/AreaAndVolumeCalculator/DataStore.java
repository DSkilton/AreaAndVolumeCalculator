package AreaAndVolumeCalculator;
import java.util.HashSet;

/**
 *
 * @author MC03353
 */
public class DataStore {
    static HashSet<String> shapeSet = new HashSet();
    
    public void setShapeName() {
        String shapeName = this.getClass().getSimpleName();
        addToList(shapeName);
    }
        
    public void addToList(String shapeName) {
        DataStore.shapeSet.add(shapeName);
    }
    
    
}
