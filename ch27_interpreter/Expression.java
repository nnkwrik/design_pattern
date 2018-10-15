package ch27_interpreter;

/**
 * Created by nnkwrik
 * 18/10/15 16:14
 */
public abstract class Expression {

    //解释器
    public void interpret(PlayContext context) {
        if (context.playText.length() == 0) return;
        else {
            String playKey = context.playText.substring(0, 1);
            context.playText = context.playText.substring(2);
            double playValue =
                    Double.parseDouble(context.playText.substring(0, context.playText.indexOf(" ")));
            context.playText = context.playText.substring(context.playText.indexOf(" ")+1);

            execute(playKey,playValue);
        }
    }

    public abstract void execute(String key, double value);
}
