package ch16_state;

/**
 * Created by nnkwrik
 * 18/10/11 10:17
 */
public class AfternoonState extends State {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 17){
            System.out.println(w.getHour() + ".pm now , feel so so, keep working");
        }else{
            w.setCurrentState(new EveningState());
            w.writeProgram();
        }
    }
}
