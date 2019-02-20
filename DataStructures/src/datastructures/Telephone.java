package datastructure;

public class Telephone {
    
    private String areaCode;
    private int number;
    private static int numberOfTelephoneObject;

    public Telephone(String areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public int getNumber() {
        return number;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public String makeFullNumber(){
       return areaCode + "-" + number;
    }
    public void Loop(){
        number++;
    }
    
    @Override
    public String toString(){
        String print = makeFullNumber();
        return print;
    }
    
    
}
