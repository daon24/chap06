class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    //클래스 변수는 인스턴스 변수 바로 사용 X
    //static int cv2 = iv; 이렇게 사용 불가
    static int cv2 = new MemberCall().iv;

    static void staticMethod(){
        System.out.println(cv);
        //클래스 메서드에서 인스턴스 변수 사용 불가
        MemberCall c = new MemberCall();
        //객체 생성 후 인스턴스 변수 참조 가능
        System.out.println(c.iv);
    }

    void instanceMethod(){
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2(){
        staticMethod();
        MemberCall c = new MemberCall();
        c.instanceMethod();
    }
}