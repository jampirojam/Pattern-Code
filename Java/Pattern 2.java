// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      int k = 0;
      for (int j = 1; j <= n; j++) {
        k = n - i + 1;
        if (j % 2 == 0) {
          System.out.print(k);
        } else {
          System.out.print(i);
        }
      }
      System.out.println(" ");
    }

  }
}

/*
OUTPUT

15151 
24242 
33333 
42424 
51515 
*/
