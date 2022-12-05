public class Clock {
    public static void main(String[] args) throws InterruptedException {
        Time clock = new Time(0,0,0);
        for (int i = 0; i < 100000; i++) {
            System.out.println(clock);
            clock.tick();
            Thread.sleep(1000);
        }
    }
}
