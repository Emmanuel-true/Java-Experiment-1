package computer;

class cpu {
    private int speed;
    private String name;

    public cpu() {

    }

    int getSpeed() {
        return speed;
    }

    String getName() {
        return name;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void setName(String name) {
        this.name = name;
    }

    public cpu(int speed) {
        this.speed = speed;
    }

    public cpu(String name) {
        this.name = name;
    }

}
