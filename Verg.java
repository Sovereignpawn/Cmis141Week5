public class Verg {
  private static boolean[] sheLovesMe = {true, false, true, false};
  public static void main(String[] args) {
    for(int i = 0; i < sheLovesMe.length; i++) {
      if(sheLovesMe[i] == true)
        System.out.println("She loves me ...");
      else
        System.out.println("She loves me not ...");
    }
    System.out.println("Whatever....");
  }
}
