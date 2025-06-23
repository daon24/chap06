class Tv {
    String color;
    boolean power;
    int channel;

    //메서드
    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
    }

class TvEx {
    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("채널 " + t.channel);
    }
}

