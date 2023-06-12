package loopPractice;

public class ForPractice3 {

    public static void main(String[] args) {


        String str = "I like to do these questions by myself now.";

        // replace every letter 'o' with '*'
        // replace every letter 'e' with '-'
        // show final version of str with * and -
        // I lik- t* d* th-s- qu-sti*ns by mys-lf n*w.

     //   str = str.replace('e', '-').replace('o', '*');
        System.out.println(str);

        for (int i =0; i< str.length(); i++){


            if (str.charAt(i) == 'o'){
                str = str.replace(str.charAt(i), '*');
            } else if (str.charAt(i) == 'e') {
                str = str.replace(str.charAt(i), '-');
            }

        }
        System.out.println( str);



    }
}
