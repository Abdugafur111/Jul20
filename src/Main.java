import jdk.swing.interop.SwingInterOpUtils;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(23);
        tv1.setVolumeLevel(5);

        System.out.println("TV1's channel is " + tv1.channel + " TV1's volume is " + tv1.volumeLevel);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.volumeUp();
        tv2.volumeUp();
        tv2.channelUp();
        System.out.println("TV2's channel is " + tv2.channel + " TV2's volume is " + tv2.volumeLevel);



    }
}





