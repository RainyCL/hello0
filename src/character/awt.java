package character;

public class awt {
    public static void main(String[] args){
        System.out.println(test());
        String a1="1";
        String a2="1";
        System.out.println(a1==a2);
   }
    public static int test(){
        try{
            return 1;
        }
        catch(Exception e){
            e.printStackTrace();
            return 2;
        }
        finally{
            return 3;
        }
    }
}
