class TvEx4{
    public static void main(String[] args) {
        Tv4[] tvArr = new Tv4[3]; //길이가 3인 객체배열

        for(int i=0; i< tvArr.length; i++){
            tvArr[i] = new Tv4();
            tvArr[i].channel = i+10;
            System.out.println(tvArr[i].channel);
        }
        for(int i=0; i < tvArr.length; i++){
            tvArr[i].channelUp();
            System.out.printf("%d %d%n",i, tvArr[i].channel);
        }
    }
}

class Tv4{
    String color;
    boolean power;
    int channel;

    void power() {power =! power;}
    void channelUp() { ++channel; }
    void channelDown() {--channel;}
 }