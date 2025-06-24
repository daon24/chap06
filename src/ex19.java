class MyMath2{
    long a, b; //인스턴스 변수

    //인스턴스 변수 a, b만을 이용해서 작업
    long add() { return a + b; }
    long subtract() { return a - b; }
    long multiply() { return a * b; }
    double divide() {return a / b; }

    //인스턴스 변수와 관게없이 매개변수만으로 작업이 가능
    static long add(long a, long b) {return a + b;}
    static long
}