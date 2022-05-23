public class Toggle {

    private volatile boolean toggleSwitch = false;

    public void on() {
        System.out.printf("%s включил тумблер \n", Thread.currentThread().getName());
        toggleSwitch = true;
    }

    public void off() {
        if (toggleSwitch) {
            System.out.printf("%s выключила тумблер\n", Thread.currentThread().getName());
            toggleSwitch = false;
        }
    }

}
