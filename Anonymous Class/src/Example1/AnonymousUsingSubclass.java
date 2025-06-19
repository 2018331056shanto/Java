package Example1;

public class AnonymousUsingSubclass {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeNoise();
        Animal bigFoot=new Animal(){
          public void makeNoise(){
              System.out.println("Haaaaaaaaaaaaaaaaaaaaaaaaaaao");
          }

        };

       bigFoot.makeNoise();
    }
}