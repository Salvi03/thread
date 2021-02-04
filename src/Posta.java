import sun.misc.Queue;

import java.util.Vector;

public class Posta extends Queue<Persona> {
    private Vector<Sportello> sportelli = new Vector<Sportello>(1,1);

    public Posta () {
        sportelli.add(new Sportello(this));
        sportelli.add(new Sportello(this));
        sportelli.add(new Sportello(this));
        sportelli.add(new Sportello(this));
    }

    public void enqueue() {
        super.enqueue(new Persona());
    }

    public void start() {
        for(Sportello sportello: sportelli) {
            sportello.start();
        }
    }

    public void addSportello() {
        sportelli.add(new Sportello(this));
    }
}
