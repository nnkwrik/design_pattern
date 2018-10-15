package ch22_bridge;

/**
 * Created by nnkwrik
 * 18/10/15 14:19
 */
public abstract class HandsetBrand {
    protected HandsetSoft soft;


    public void setSoft(HandsetSoft soft) {
        this.soft = soft;
    }

    public abstract void run();
}
