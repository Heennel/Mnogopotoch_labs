public class Potok extends Thread {
    public void run() //Этот метод будет выполняться в побочном потоке
    {
        for(int i=0; i<=100; i+=10){
            System.out.println(i + " Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
