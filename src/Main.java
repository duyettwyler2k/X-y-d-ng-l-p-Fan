public class Main {
    public static void main(String[] args) {
        fan fan=new fan(true,1,10,"yellow");
        System.out.println(fan.toString());
        fan fan1=new fan();
        System.out.println(fan1.toString());
        fan fan2=new fan(3,10,"brown");
        System.out.println(fan2.toString());
    }
}
