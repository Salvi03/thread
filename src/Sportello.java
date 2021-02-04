public class Sportello extends Thread {
    private boolean isActive = false;
    private Posta posta;

    public Sportello(Posta posta) {
        super();
        this.posta = posta;
    }

    public void work() throws InterruptedException {
        System.out.println("Ho iniziato");
        this.isActive = true;
        Thread.sleep((long)(Math.random()*10000));
        this.finish();
        System.out.println("Ho finito");
    }

    private void finish() {
        this.isActive = false;
    }

    public boolean isWorking() {
        return this.isActive;
    }

    @Override
    public void run() {
        while (true)
            if (this.isActive) {
                try {
                    this.work();
                } catch (InterruptedException e) {
                    System.out.print("");
                }
            } else {
                if (!posta.isEmpty()) {
                    try {
                        posta.dequeue();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        this.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
    }
}
