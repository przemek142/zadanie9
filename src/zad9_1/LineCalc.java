package zad9_1;

public class LineCalc {
    public static double lineLength(Line2D line){
        return Math.sqrt(Math.pow(line.getLineEnd().getPosX()-line.getLineStart().getPosX(),2)+
                Math.pow(line.getLineEnd().getPosY()-line.getLineStart().getPosY(),2));
    }
}
