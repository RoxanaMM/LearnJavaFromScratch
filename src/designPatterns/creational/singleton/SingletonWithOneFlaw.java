package designPatterns.creational.singleton;


/*
This has the purpose of showing one example of singleton but it has a flaw
Intre operatia de creare si cea de initializare exista un pic de delay
Acel delay poate cauza probleme intr-un mediu de multi-threading.
* */
public class SingletonWithOneFlaw {

    private static SingletonWithOneFlaw instantance;

    private SingletonWithOneFlaw() {
    }

   public static SingletonWithOneFlaw getInstance(){
        if(instantance == null) {
            //this is very interesting because we are saving time
            //and memory space. This method is going to be called
            //for many times so there is no point in having all
            //those thread-safe checkLock-lock-unlock made everytime
            //the class is called, we do this only when the instance
            //is created. And this is once :D
            synchronized (SingletonWithOneFlaw.class) {
                if (instantance == null) {
                    instantance = new SingletonWithOneFlaw();
                }
            }
        }
        return instantance;
    }
}
