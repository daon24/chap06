class CardEx{
    public static void main(String[] args) {
        System.out.println(Card.width);
        System.out.println(Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println(c1.number+" " + c1.width+ " "+  c1.height);
        System.out.println(c2.number+" " + c2.width+ " "+  c2.height);

        //클래스 변수의 값 변경하기
        Card.width = 50;
        Card.height =80;
        System.out.println(c1.kind+" "+ c1.number+" " + c1.width+ " "+  c1.height);
        System.out.println(c2.kind+" "+ c2.number+" " + c2.width+ " "+  c2.height);

    }
}


class Card{
    String kind ;
    int number;
    static int width = 100;
    static int height = 250;
}