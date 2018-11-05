public class Driver {

  public static void main(String[] args) {
    
    SuperArray sa = new SuperArray();
     
    sa.add("zero");
    sa.add("one");
    sa.add("two");
    
    System.out.println(sa.toString());
    
    for(int q = 0; q < 3000; q++) {
        sa.add("asd");
    }
    
    for(int s = 0; s < 200; s++) {
        sa.remove("asd");
    }
    
    int tyuio = sa.size();
    for(int w = tyuio - 2; w > tyuio - 201; w--) {
        System.out.println(sa.remove(w));
    }
    
    
    for(int werwerwer = 0; werwerwer < 3; werwerwer++) {
    sa.add("0");
    System.out.println(sa.size());
    }
    
    System.out.println(sa.indexOf("asd"));
    System.out.println(sa.indexOf("wuio"));
    System.out.println(sa.lastIndexOf("asd"));
    System.out.println(sa.lastIndexOf("wuio"));
    
    for(int qwe = 300; qwe < 401; qwe++) {
        System.out.println("Changed: " + qwe + " " + sa.set(qwe, "100"));
    }
    
    sa.clear();
    System.out.println(sa.toString());
    
    
  }
}
