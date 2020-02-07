public class Statickey {
    static int count=0;

    public static void showData() {
        System.out.println(count);
        System.out.println("Inside static method");
    }
    private void getData()
    {
        System.out.println(count+1);
        System.out.println("Inside non-static method");
    }
    static
    {
        System.out.println("Static BLock runs before Main method");
    }
    public static void main (String args[])
    {
        Statickey sk=new Statickey();
        showData();
        sk.getData();
    }
}
