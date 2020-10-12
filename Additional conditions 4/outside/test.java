package outside;
import inside.*;

public class test {
    public static void main(String[] args){
        inside.moutherBoard mb = new inside.moutherBoard();
        inside.cpu cpu = new inside.cpu();
        inside.HardDisk hd = new inside.HardDisk();
        inside.Screen sc = new inside.Screen();
        sc.setRefresh_rate(240);
        sc.setSize((float) 15.6);
        mb.setId("msi");
        mb.setPrice(6000);
        cpu.setName("i7");
        cpu.setSpeed(2200);
        hd.setAmount(200);
        hd.setSpeed(5400);
        pc pc = new pc();
        pc.setScreen(sc);
        pc.setCpu(cpu);
        pc.setHardDisk(hd);
        pc.setMoutherBoard(mb);
        pc.show();
    }
}
