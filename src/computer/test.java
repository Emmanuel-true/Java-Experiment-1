package computer;

public class test {
    public static void main(String[] args){
        moutherBoard mb = new moutherBoard();
        cpu cpu = new cpu();
        HardDisk hd = new HardDisk();
        mb.setId("msi");
        mb.setPrice(6000);
        cpu.setName("i7");
        cpu.setSpeed(2200);
        hd.setAmount(200);
        hd.setSpeed(5400);
        pc pc = new pc();
        pc.setCpu(cpu);
        pc.setHardDisk(hd);
        pc.setMoutherBoard(mb);
        pc.show();
    }
}
