package loopPractice;

public class NestedForLoop4 {
    public static void main(String[] args) {
        /*
        	print out years and months in a following format for the years from 2023 to 2026

			2023 --> 1 -JAN-,2 -FEB-,3 -MARCH-,4, ..... 12
			2024 --> 1 -JAN-,2 -FEB-,3 -MARCH-,4, ..... 12
			.....
			2026 --> 1 -JAN-,2 -FEB-,3 -MARCH-,4, ..... 12
         */

        for (int year = 2023; year <= 2026; year++) {
            System.out.print(year + "-->");

            for (int month = 1; month <= 12; month++) {


                //if(month ==1){System.out.print(month+ " -JAN-, ");}
                switch (month) {
                    case 1:
                        System.out.print(month + " -JAN-, ");
                        break;
                    case 2:
                        System.out.print(month + " -FEB-, ");
                        break;
                    case 3:
                        System.out.print(month + " -MARCH-, ");
                        break;
                    default:
                        if (month == 12) {
                            System.out.print(month);
                        } else {
                            System.out.print(  month +", ");
                        }
                        break;
                }
            }
            System.out.println();


        }


    }
}
