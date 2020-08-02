package equals1;

import org.junit.jupiter.api.Assertions;

public class EqualsExample {
    public static void main(String[] args) {   	
        Dog spike = new Dog("Спайк");
        Dog lord = spike;
        System.out.println(spike.equals(lord));

    Assertions.assertTrue(spike.equals(lord));


        Dog tony = new Dog("Тони");
        Dog tonyMotnata = new Dog("Тони");

   //   Assertions.assertTrue(tony.equals(tonyMotnata));
      System.out.println(tony.equals(tonyMotnata));
    }

}
