package Exception;

public class Exception_1 {
    public static void main(String[] args) {
        try{
            System.out.println("Hello world");
            System.out.println(5/0);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
