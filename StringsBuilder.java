public class StringsBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // Char at Index 0
            System.out.println(sb.charAt(0));

        // set char at index 0
           
           sb.setCharAt(0, 'M');
            
            System.out.println(sb);

        // insert

           sb.insert(0, 'S');
           System.out.println(sb);

           sb.insert(2, 'N');
           System.out.println(sb);

        // Delete the extra 'N'
            sb.delete(2, 3);
            System.out.println(sb);

        //  Append
           sb.append("A"); // str = str + "A";
           sb.append("B"); // str = str + "B";
           System.out.println(sb);

        //  Length
            System.out.println(sb.length());
             








        
    }
    
}
