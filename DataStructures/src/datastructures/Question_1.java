package datastructure;

public class Question_1 {

    public static void main(String[] args) {
        
        Telephone tel = new Telephone("03",79676300);
        System.out.println(tel.toString());  
            for (int i=1; i<=4;i++){
                tel.Loop();
                System.out.println(tel.toString());
        }
    }
}
