/**
 * Created by IntelliJ Idea.
 * User: Menard Feko
 * Date: 4/5/18
 * Time: 11:55 AM
 * Contact: fekomenard@yahoo.fr
 * .java was created for...
 */
    public class Stringmanipulation {

        public String rev(String newstring){
            String reverse="";
            for(int i=newstring.length()-1;i>=0;i++){
                reverse= reverse + newstring.charAt(i);
            }
            System.out.println("reverse is "+reverse);
            return reverse;
        }
        public String decimate(String newstring) {
            String dec;
            dec = newstring -newstring.charAt(5);


        }
        public static void main(String[] args){
            Stringmanipulation ts= new Stringmanipulation();


        }
    }


}
