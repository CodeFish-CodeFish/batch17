package accessModifierPractice;

public class Animal {


    public String namePublic;
    protected String colorProtected;
    private int agePrivate;
    int weightDefault;


    public void runPublic() {
        agePrivate = 25;
        System.out.println("Run Public");
    }

    protected void runProtected() {
        System.out.println("Run Protected");
    }

    private void runPrivate() {
        System.out.println("Run Private");
    }

    void runDefault() {
        runPrivate();
        System.out.println("Run Default");
    }

    public static void main(String[] args) {
        Animal a2 = new Animal();

        a2.runPrivate();

        a2.agePrivate = 11;

    }


    public Animal() {
        System.out.println("CONST");
    }

   private Animal(int a) { }


}
