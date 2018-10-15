package ch16_state;

/**
 * Created by nnkwrik
 * 18/10/11 10:17
 */
public class MorningState extends State {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 12){
            System.out.println(w.getHour() + ".am now , feel good");
        }else{
            w.setCurrentState(new NoonState());
            w.writeProgram();
        }
    }
}
