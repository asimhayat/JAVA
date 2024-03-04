import java.util.Timer;
import java.util.TimerTask;
class Main {
    public static void main(String[] args) {
        final int[] seconds = {10};
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                if (seconds[0] >0) {
                    System.out.println(seconds[0]);
                    seconds[0]--;
                }else{
                    System.out.println("Time is up!");
                    timer.cancel();
                }

            }
        },0,1000);;


    }
    }
