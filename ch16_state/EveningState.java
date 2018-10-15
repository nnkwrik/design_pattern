package ch16_state;

/**
 * Created by nnkwrik
 * 18/10/11 10:17
 */
public class EveningState extends State {
    @Override
    public void writeProgram(Work w) {
        if (w.isFinish()){
            w.setCurrentState(new RestState());
            w.writeProgram();

        }
        else{
            if (w.getHour() < 21){
                System.out.println(w.getHour() + ".pm now , feel tired");
            }else{
                w.setCurrentState(new SleepingState());
                w.writeProgram();
            }
        }
    }
}
