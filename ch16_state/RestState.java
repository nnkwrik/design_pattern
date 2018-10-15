package ch16_state;

/**
 * Created by nnkwrik
 * 18/10/11 10:17
 */
public class RestState extends State {
    @Override
    public void writeProgram(Work w) {

            System.out.println(w.getHour() + ".pm now , go back to home");

    }
}
