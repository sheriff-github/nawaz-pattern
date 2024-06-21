public class nawazPattern {
    public static void main(String[] args) {
        n();
        a();
        w();
        a();
        z();
    }

    public static void n() {
        for (int i=1; i<=5;i++){
            for (int j=1; j<=5; j++){
                if (i==j ||j==1 ||j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void a() {
        System.err.println("\n");
        for (int i=1; i<=5;i++){
            for (int j=1; j<=5; j++){
                if (i==1 ||i==3 ||j==5 ||j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void w() {
        System.err.println("\n");
        for (int i=1; i<=4;i++){
            for (int j=1; j<=12; j++){
                if (i==j ||i+j==8 ||j-i==6 ||i+j==14){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void z() {
        System.err.println("\n");
        for (int i=1; i<=5;i++){
            for (int j=1; j<=5; j++){
                if (i==1 ||i+j==6 ||i==5 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
