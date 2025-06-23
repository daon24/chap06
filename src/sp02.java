public class sp02 {
    public static void main(String[] args) { //왜이렇게 해야하는지 모르겟은...
        print99danAll();
    }


    public static void print99danAll() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.print(j+"*"+i+"="+j * i+" ");
            }
            System.out.println();
        }
    }
}
