public class IncrementDecrement {
     public static void main (String[]args){

        int num=10;

        System.out.println("Initial Value:" + num);

        num++;
        System.out.println("After Increment:" +num);

        num--;
        System.out.println("After Decrement:" +num);

        int preIncrement = ++num;
        System.out.println("Pre increment value:" +preIncrement);

        int postIncrement = num++;
        System.out.println("Post increment value:" +postIncrement);
        System.out.println("value after Postincrement :" +num);

        int preDecrement = --num;
        System.out.println("Pre Decrement value:" +preDecrement);

        int postDecrement = num--;
        System.out.println("Post Decrement value:" +postDecrement);
        System.out.println("value after Post Decrement :" +num);




     }
}
