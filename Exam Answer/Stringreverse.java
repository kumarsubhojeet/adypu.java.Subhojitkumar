public class Stringreverse
{
    public static void main(String[] args) 
    {
        String blogName = "How Are You ";
         
        String reverseString = reverseString(blogName);
         
        System.out.println(reverseString);
    }
     
    public static String reverseString(String string)
    {
        if (string.isEmpty()){
         return string;
        }
        //Calling function recursively
        return reverseString(string.substring(1)) + string.charAt(0);
    }
}