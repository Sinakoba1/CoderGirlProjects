package TapestryController;

public class BrokenWigglePattern extends Pattern{
    public String comboStitch() {
        boolean needleJam = (Math.random() < 0.40d);
        if(needleJam){
            return "xXxXx ";
        }
        return "xXxXxXxXxX";
    }
}