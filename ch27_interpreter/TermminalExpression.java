package ch27_interpreter;

/**
 * Created by nnkwrik
 * 18/10/15 16:19
 */
public class TermminalExpression extends Expression {
    @Override
    public void execute(String key, double value) {
        String note = "";
        switch (key){
            case "C":
                note = "1";
                break;
            case "D":
                note = "2";
                break;
            case "E":
                note = "3";
                break;
            case "F":
                note = "4";
                break;
            case "GG":
                note = "5";
                break;
            case "A":
                note = "6";
                break;
            case "B":
                note = "7";
                break;

        }

        System.out.println(note);
    }
}
