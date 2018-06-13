package TapestryController;

public class CrossStitchWigglePattern extends Pattern{
    public String comboStitch() {
        {
            boolean needleJam = (Math.random() < 0.05d);
            if(needleJam){
                return "xXxXx ";
            }
            return "xXxXxXxXxX";
        }
    }
}