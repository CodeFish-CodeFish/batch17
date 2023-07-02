package objectPractice;

public class Bottle {
    /*
    -size(small, medium,large)
	-isClean
	-color
	-materialType(plastic, paper, glass, ...)
     */
    String size, color, materialType;
    boolean isClean;

    public Bottle(String size, String color, String materialType, boolean isClean) {
        if (!size.equalsIgnoreCase("small") &&
                !size.equalsIgnoreCase("medium") &&
                !size.equalsIgnoreCase("large")) {
            this.size = "small";
        }else {
            this.size = size;
        }
        this.color = color;
        this.materialType = materialType;
        this.isClean = isClean;
    }
    public static Bottle[] checkBottle(Bottle[] bottles) {
        Bottle[] specialItems = new Bottle[bottles.length];
        int index = 0;
        for (Bottle item : bottles) {
            System.out.println( item.size );
            if (item.isClean == true && item.color.equalsIgnoreCase("blue")
                    && !item.materialType.equalsIgnoreCase("plastic")) {

                specialItems[index] = item;
                index++;
            }
        }
        return specialItems;
    }


    @Override
    public String toString() {
        return "Bottle{" +
                "color='" + color + '\'' +
                ", materialType='" + materialType + '\'' +
                ", isClean=" + isClean +
                '}';
    }
}
