package multiThreading.deadLock;

public class DeadLockTesting {

    static class Friend {

        private String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        synchronized public void bowBack(Friend friend, String threadName){
            System.out.println("he did it " +
                    this.name + "  " + friend.getName() + threadName);
        }
        synchronized public void bow(Friend friend, String threadName){
            System.out.println(name + " bow " +
                    this.name + "  " +friend.getName());
            System.out.println(" ThreadName " + threadName);
            friend.bowBack(this, threadName);
        }


    }

    static final Friend alphone = new Friend("Alphonse");
    static final Friend garcon = new Friend("Garcon");
    static Thread thread1, thread2;
    public static void main(String ...args) {

        thread1 = new Thread(new Runnable() {
            public void run() {
                alphone.bow(garcon, thread1.getName());
            }
        }) ;
        thread1.start();

       thread2 = new Thread(new Runnable() {
            public void run() {
                garcon.bow(alphone, thread2.getName());
            }
        });
       thread2.start();
    }

}
