public class App {  

    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
    //The nth element input
    System.out.print("Enter an element for Fibonacci sequence: ");
    int n = sc.nextInt();
    sc.close();
    

    //Print out of Iteration
    long start = System.nanoTime();
    System.out.printf("Fibonacci iteration sequence is(Element at index %d) = %d \n", n, fibIteration(n));
    System.out.printf("Time: %d nanoTime\n",  System.nanoTime() - start);

    //Print out of recursive 
    start = System.nanoTime();;
    System.out.printf("Fibonacci recursive sequence is (element at index %d) = %d \n", n, fibRecursion(n));
    System.out.printf("Time: %d NanoTime\n",  System.nanoTime()- start);
     
    }
    
     //The Iteration 
     static int fibIteration(int n) {
        int x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = y + x;
        }
        return x;
    }

    //The Recursion
    static int fibRecursion(int  n) {
        if ((n == 1) || (n == 0)) {
            return n;
        }
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }
    }


