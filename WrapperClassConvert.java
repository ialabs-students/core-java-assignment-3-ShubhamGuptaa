public class WrapperClassConvert{
    // Creating method as convertToWrapper
    public static Object convertToWrapper(int obj){
        // Initializing the wrapper class
        Integer object = Integer.valueOf(obj);
        // using exception handling
        try{
            // checking the condition of instance if it exist or not
            if(object instanceof Integer){
                return object;
            }

            else{
                System.out.println("Give proper primitive as input");
            }
              
        }     
        // throws an exception
        catch (Exception e){
            System.out.println(e);

        }
       
        return object;
    }
    public static void main(String[] args) {
        // creating variable
        int obj = 10;
        // caling the method as convertToWrapper
        System.out.println(convertToWrapper(obj));
    }
}