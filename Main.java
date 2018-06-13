package TapestryController;

public class Main {
    public static void main(String[] args){

        Stitch singleStitch[] = new Stitch[7];
        singleStitch[0]=new ShortLineStitch();
        singleStitch[1]=new SmallCrossStitch();
        singleStitch[2]=new LargeCrossStitch();
        singleStitch[3]=new CircleStitch();
        singleStitch[4]=new FillStitch();
        singleStitch[5]=new BlockStitch();
        singleStitch[6]=new ZigZagStitch();

        for (int a = 0; a < 7; a++){
            System.out.println(singleStitch[a].singleStitch());
        }
        Pattern comboStitch[] = new Pattern[5];
        comboStitch[0]=new CrossStitchWigglePattern();
        comboStitch[1]=new ZigZagLinesPattern();
        comboStitch[2]=new BaublePattern();
        comboStitch[3]=new BlockyBaublePattern();
        comboStitch[4]=new BrokenWigglePattern();

        boolean keepGoing = true;
        int count = 0;
        while (keepGoing){
            count++;
            keepGoing = (count < 3);

        for (int row = 0; row < comboStitch.length; row++){
            for (int column = 0; column < comboStitch.length; column++)
                System.out.print(comboStitch[row].comboStitch());
             System.out.println();

        }
    }

    }
}
