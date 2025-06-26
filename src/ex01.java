class Tv{
    //Tv의 속성(멤버변수)
    String color;
    boolean power;
    int channel;

    //Tv의 기능(메서드)
    void power() { power =! power; }
    void channelUp() { ++channel; }
    void channelDown() {-- channel;}
}

class TvEx{
    public static void main(String[] args) {
        Tv t; // 객체 참조하기 위한,, 참조변수 t
        t = new Tv(); //인스턴스 생성
        t.channel = 7; // 인스턴스의 멤버변수 값을 7로 한다
        t.channelDown(); //인스턴스의 메서드 호출
        System.out.println(t.channel);
    }
}