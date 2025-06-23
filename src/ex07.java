class CallStackEx{
    public static void main(String[] args) {
        firstMethod();
    }

    static void firstMethod(){ // 객체 생성하지 않고 메서드 호출하려면 static 붙이기
        secondMethod();
    }

    static void secondMethod(){
        System.out.println("secondMethod()");
    }
}