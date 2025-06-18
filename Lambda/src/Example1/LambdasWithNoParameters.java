package Example1;


public class LambdasWithNoParameters {
    public static void main(String[] args) {

        Cat mycat=new Cat("Minu",1);

        mycat.print();
        printThing(mycat);

//        printThing(public void print(){
//            System.out.println("Minu");
//        });
        printThing(()-> System.out.println("Minu"));
       Printable lambdaPrintable=()-> System.out.println("Minu");
       printThing(lambdaPrintable);


    }

    static void printThing(Printable thing){
        thing.print();
    }
}