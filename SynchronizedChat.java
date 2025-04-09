class Chat {
    synchronized void say(String msg) {
        System.out.print("[ " + msg);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
        System.out.println(" ]");
    }
}

class Friend1 extends Thread {
    Chat c;

    Friend1(Chat c) {
        this.c = c;
    }

    public void run() {
        c.say("Hi!");
        c.say("How are you?");
    }
}

class Friend2 extends Thread {
    Chat c;

    Friend2(Chat c) {
        this.c = c;
    }

    public void run() {
        c.say("Hello!");
        c.say("I'm good, and you?");
    }
}

public class SynchronizedChat {
    public static void main(String[] args) {
        Chat chat = new Chat();
        Friend1 t1 = new Friend1(chat);
        Friend2 t2 = new Friend2(chat);
        t1.start();
        t2.start();
    }
}
