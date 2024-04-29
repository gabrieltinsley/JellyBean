public class JellyBean {
    public static void main(String[] args) {
        for(int i = 1; i < 52; i++) {
            if(i % 5 == 0 && i % 2 == 0) {
                System.out.print("Yuck! ");
            }
            else if(i % 5 == 0) {
                System.out.print("Bean ");
            }
            else if(i % 2 == 0) {
                System.out.print("Jelly ");
            } 
            else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
