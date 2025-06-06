class PriorityThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Priority: " + getPriority());
    }

    public static void main(String[] args) {
        PriorityExample t1 = new PriorityExample();
        PriorityExample t2 = new PriorityExample();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setName("Low Priority Thread");
        t2.setName("High Priority Thread");
        t1.start();
        t2.start();
    }
}
