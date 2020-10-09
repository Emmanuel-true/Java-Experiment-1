package computer;

class pc {
    private cpu cpu;
    private HardDisk hd;
    private moutherBoard mb;
    void setCpu(cpu cpu){
        this.cpu = cpu;
    }
    void setHardDisk(HardDisk hd){
        this.hd = hd;
    }
    void setMoutherBoard(moutherBoard mb){
        this.mb = mb;
    }
    void show(){
        System.out.println("moutherBoard was " + mb.getId());
        System.out.println("moutherBoard's price was " + mb.getPrice());
        System.out.println("cpu's name is " + cpu.getName());
        System.out.println("cpu's speed is " + cpu.getSpeed());
        System.out.println("HardDisk's capacity is " + hd.getAmount());
        System.out.println("HardDisk's speed was " + hd.getSpeed());
    }
}
