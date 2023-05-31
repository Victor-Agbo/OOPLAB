package LAB11;

public class prog1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                while(true){
                    System.out.println("Good morning");
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run(){
                while(true){
                    System.out.println("Hello");
                    try{
                        Thread.sleep(2000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread3 = new Thread(){
            @Override
            public void run(){
                while(true){
                    System.out.println("Welcome");
                    try{
                        Thread.sleep(3000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
