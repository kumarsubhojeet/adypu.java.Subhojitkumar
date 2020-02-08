package keywords;

public class ThisKey {
	 int id;
     String name;    
     ThisKey(int id,String name) { 
      this.id=id;
      this.name=name;
      System.out.println("constructor body : id : "+id+"\nName : "+name);
     }
     private void showData() {
     System.out.println("id : "+id+"\nName : "+name);
     }
     
     public static void main(String[] args) {
        ThisKey key=new ThisKey(1,"abcd");
        key.showData();
}
     
}

    © 2020 GitHub, Inc.
    Terms