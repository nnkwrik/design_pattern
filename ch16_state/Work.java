package ch16_state;

/**
 * Created by nnkwrik
 * 18/10/11 10:19
 */
public class Work {

    private State currentState = new MorningState();

    private double hour;
    private boolean finish;


    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void writeProgram(){
        currentState.writeProgram(this);
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
