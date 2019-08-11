package testingDesignPatterns.structural.proxy;

public class Client {
/*
    There are plenty of reasons we want to implement proxy and this design pattern is one of the most important
    when it's about controlling the access or constructing metrics about use of services/objects.

    Remote proxy - remote communication is taken care of and client only talks with the
    remote objects he/she is interested in

    Virtual proxy - delay on creation and initialization on expensive objects
    - lazy initialization ( Hibernate operates on this concept -
    creates proxy entities over the objects

    Protection proxy - implement security over the original object
    - maybe checking for credentials before accessing an object

    Smart proxy - performs additional housekeeping work when an object is accessed by a
    client.

 */
    public static void main(String...args){
        System.out.println("We are not calling directly the RealObject" +
                "but instead we call a proxy over it so we can verify" +
                "plenty of details before giving the actual object");
        RealObjectProxy realObjectProxy = new RealObjectProxy();
        realObjectProxy.doSomething();

    }
}
