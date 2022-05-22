public class Main {
    public static void main(String[] args) throws InterruptedException {
        Toy toy = new Toy();
        User user = new User(toy);

        Thread thread1 = new Thread(null, user, "Пользователь");
        Thread thread2 = new Thread(null, toy, "Игрушка");

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.interrupt();
    }

}

