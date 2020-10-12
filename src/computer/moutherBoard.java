package computer;

class moutherBoard {
    private String id;
    private int price;

    public moutherBoard() {

    }

    int getPrice(){
        return price;
    }
    String getId(){
        return id;
    }
    void setPrice(int price){
        this.price = price;
    }
    void setId(String id){
        this.id = id;
    }

    public moutherBoard(String id, int price) {
        this.id = id;
        this.price = price;
    }
}
