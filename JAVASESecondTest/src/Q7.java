class Q7 implements Runnable{
    @Override
    public void run() {
        System.out.println("Running");
    }

    public static void main(String[] args) {
        Q7 question =new Q7();
        Thread thread=new Thread(question);
        thread.start();
    }
}


