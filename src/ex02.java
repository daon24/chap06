class Tv2{
    //멤버변수
    String color;
    boolean power;
    int channel;

    //메서드
    void power() { power = !power;}
    void channelUp() { ++channel;}
    void channelDown() {--channel;}
}

class TvEx2{
    public static void main(String[] args) {
        Tv2 t1 = new Tv2(); // 참조변수 & 객체 생성 동시에
        Tv2 t2 = new Tv2();
        System.out.println(t1.channel);
        System.out.println(t2.channel);

        t1.channel = 7;
        System.out.println(t1.channel);
        System.out.println(t2.channel);
    }
}