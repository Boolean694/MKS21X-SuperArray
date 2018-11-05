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
    
    sa.add(67890,"u");
    
    
  }
}
