public class foobar {
    public static void main(String[] args) {
        
        
        
        for (int x=1; x<=100; x++) {
            if (x%3==0 && x%5==0) {
                System.out.println("foobar");


            }
            else if (x%5==0) {
                System.out.println("bar");
            }

            else if (x%3==0) {
                System.out.println("foo");
            }

            else {
                System.out.println(x);
            }
            
            
            }
    }
}
