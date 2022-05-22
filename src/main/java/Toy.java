public class Toy extends Thread {

    private Toggle toggle = new Toggle();

    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            toggle.off();
        }
        System.out.printf("%s отключена\n", Thread.currentThread().getName());
    }

    public void onToggle() {
        toggle.on();
    }

}
