public class Logger{
    private static Logger logger;
    public Logger(){
        System.out.println("Instance is created");
    }
    public static  Logger getInstance(){
        if(logger==null){
            logger=new Logger();
        }
        return logger;
}
public void log(String msg){
    System.out.println("LOG Message: "+ msg);
}
public void error(String msg){
    System.out.println("Error Message "+msg);
}
}