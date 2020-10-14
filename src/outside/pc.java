package outside;
import inside.*;
class pc {
    private inside.cpu cpu;
    private inside.HardDisk hd;
    private inside.moutherBoard mb;
    private inside.Screen sc;
    void setCpu(cpu cpu){
        this.cpu = cpu;
    }
    void setHardDisk(HardDisk hd){
        this.hd = hd;
    }
    void setMoutherBoard(moutherBoard mb){
        this.mb = mb;
    }
    void setScreen(Screen sc){
        this.sc = sc;
    }
    void show(){
        System.out.println("The Screen size was " + sc.getSize());
        System.out.println("The Screen's refresh rate was " + sc.getRefresh_rate());
        System.out.println("moutherBoard was " + mb.getId());
        System.out.println("moutherBoard's price was " + mb.getPrice());
        System.out.println("cpu's name is " + cpu.getName());
        System.out.println("cpu's speed is " + cpu.getSpeed());
        System.out.println("HardDisk's capacity is " + hd.getAmount() + "GB");
        System.out.println("HardDisk's speed was " + hd.getSpeed());
    }
}
