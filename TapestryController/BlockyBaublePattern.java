package TapestryController;

public class BlockyBaublePattern extends Pattern{
    public String comboStitch() {
        {
            boolean needleJam = (Math.random() < 0.10d);
            if(needleJam){
                return "[]--o--[ ";
            }
            return "[]--o--[]--o--[]--o-";
        }
    }
}