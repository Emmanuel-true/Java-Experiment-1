package computer;

class HardDisk {
    private int amount;
    private int speed;

    public HardDisk() {

    }
    int getAmount(){
        return amount;
    }
    int getSpeed(){
        return speed;
    }
    void setAmount(int amount){
        this.amount = amount;
    }
    void setSpeed(int speed){
        this.speed = speed;
    }

    public HardDisk(int amount, int speed) {
        this.amount = amount;
        this.speed = speed;
    }
}
