
//class TestClass{
//    void instanceMethod() {} //인스턴스 메서드
//    static void staticMethod() {} //static 메서드
//
//    void instanceMethod2(){
//        instanceMethod();
//        staticMethod();
//    }
//    static void staticMethod2(){
//        instanceMethod(); //static 메서드에서 인스턴스 메서드 호툴 X
//        staticMethod();
//    }
//}
//
//
//class TestClass2{
//    int iv; //인스턴스 변수
//    static int cv; // 클래스 변수
//
//    void instanceMethod(){
//        System.out.println(iv);
//        System.out.println(cv);
//
//    static void staticMethod()  {
//        System.out.println(iv); //인스턴스 변수 사용 불가!
//        System.out.println(cv);
//    }
//}