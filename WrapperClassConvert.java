public class WrapperClassConvert{
    
    public static Object convertToWrapper(int obj){
        Integer object = Integer.valueOf(obj);
        try{
            if(object instanceof Integer){
                return object;
            }

            else{
                System.out.println("Give proper primitive as input");
            }
              
        }     
        catch (Exception e){
            System.out.println(e);

        }
       
        return object;
    }
    public static void main(String[] args) {
        int obj = 10;
        System.out.println(convertToWrapper(obj));
    }
}