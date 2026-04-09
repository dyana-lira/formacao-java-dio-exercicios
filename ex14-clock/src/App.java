public class App {
    public static void main(String[] args) throws Exception {
        Clock brlClock = new BRLClock();
        Clock usClock = new USClock();

        brlClock.setSecond(0);
        brlClock.setMinute(0);
        brlClock.setHour(25);

        System.out.println(brlClock.getTime());
        System.out.println(usClock.convert(brlClock).getTime());

    }
}
