package Thread;

public class thread {
    public static void main(String[] args) {
      for (int i = 0; i < 10; i++) {
          Thread thread = new Thread(new RunnableImpl());
         thread.start();
      }
    }
}
