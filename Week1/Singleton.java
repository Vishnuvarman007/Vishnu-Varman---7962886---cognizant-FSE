public class Singleton {
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        l1.log("User Logged Into the Website");
        l2.error("User failed to login");
        System.out.println("Logger1 HashCode:"+l1.hashCode());
        System.out.println("Logger3 HashCode:"+l2.hashCode());
        if(l1==l2){
            System.out.println("Only one Logger Instance Exists");
        }
        else{
            System.out.println("Multiple Logger Instance Exists");
        }

    }
}
