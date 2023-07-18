package accessModifierPractice;

public class TestAnimal {
    public static void main(String[] args) {


        Animal a1 = new Animal();

        a1.namePublic = "Tom";
        a1.colorProtected = "DarkBlue";
        a1.weightDefault = 10;
      //  a1.age >> since age has private access modifier
                    // we cannot reach it from different class

        a1.runPublic();
        a1.runDefault();
        a1.runProtected();
    }
}
