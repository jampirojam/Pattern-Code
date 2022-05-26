// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      if (i % 2 != 0) {
        for (int j = 1; j <= n; j++) {
          System.out.print(j);
        }
      } else {
        for (int j = n; j >= 1; j--) {
          System.out.print(j);
        }
      }
      System.out.println("");
    }
    
  }
}

/*
OUTPUT

12345
54321
12345
54321
12345
*/
