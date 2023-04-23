package HW1;

public class Task1 {
    public static void main(String[] args) {
        String string="not empty";
        int middle=string.length()/2;
        if (string.isEmpty() || string.isBlank()){
            System.out.println("Error");
        }
        for (int i=0;i<string.length();i++){
            if (string.charAt(i)%2 != 0 && string.length()>3){
                System.out.println(string.charAt(middle));
                break;
            }
        }
    }
}
