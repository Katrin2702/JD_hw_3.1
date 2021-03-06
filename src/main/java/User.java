public class User extends Thread {

    private Toy toy;
    private static final int timeOut = 5000;
    private static final int numberOn = 5;

    public User(Toy toy) {
        this.toy = toy;
    }

    public void run() {
        for (int i = 0; i < numberOn; i++) {
            try {
                toy.onToggle();
                Thread.sleep(timeOut);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Завершено выполнение потока %s\n", Thread.currentThread().getName());
    }

}
