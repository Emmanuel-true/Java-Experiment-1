package computer;

class Screen {
    private float size;
    private int refresh_rate;
    float getSize(){
        return size;
    }
    int getRefresh_rate(){
        return refresh_rate;
    }
    void setSize(float size){
        this.size = size;
    }
    void setRefresh_rate(int refresh_rate){
        this.refresh_rate = refresh_rate;
    }

    public Screen() {
        this.size = size;
        this.refresh_rate = refresh_rate;
    }
}
