package ch16_state;

/**
 * Created by nnkwrik
 * 18/10/11 10:17
 */
public class NoonState extends State {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 13){
            System.out.println(w.getHour() + ".pm now , feel sleepy");
        }else{
            w.setCurrentState(new AfternoonState());
            w.writeProgram();
        }
    }
}
