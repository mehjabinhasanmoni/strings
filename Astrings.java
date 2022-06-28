public class Astrings {

    public static void main(String[] args) {
        // Strings Decleration
            String name = "Tony";
            String fullName= "Tony Strak";
            String sentence = "My name is Tony.";

        
        
        // Concatenation
            String firstName = "Tony";
            String lastName = "ABC";
            String fullName = firstName + " " + lastName;

            System.out.println(fullName);

        //  Length

            String firstName = "Tony";
            String lastName = "ABC";
            String fullName = firstName + " " + lastName;

            System.out.println(fullName.length());

        //  charAt

            for(int i =0;i<fullName.length();i++){
                System.out.println(fullName.charAt(i));

            }
        
        // Compare

            String name1 = "Tony";
            String name2 = "Tonyk";

            // 1 s1 > s2 ; +ve Value
            // 2 s1 == s2; 0
            // 3 s1 < s2 ; -ve Value

            if(name1.compareTo(name2) == 0) {
                System.out.println("Strings are equal");

            }else{
                System.out.println("String are not equal");
            }


        // Sub-Sting
                String sentence = "My name is Tony";
                String name = sentence.substring(11, sentence.length());
                System.out.println(name);
    }
    
}
