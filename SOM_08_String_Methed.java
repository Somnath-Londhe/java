public class SOM_08_String_Methed {
    public static void main(String[] args) {
        // Method 1 string length function
        String name = "Somnath";
        int value = name.length();
        System.out.println(value);
        // Method 2 string lowercase function

        String lowercase = "somanth";
        String value1 = lowercase.toLowerCase();
        System.out.println(value1);
        // Method 3 string uppercase function

        String uppercase = "somanth";
        String value2 = uppercase.toUpperCase();
        System.out.println(value2);

        // Method 4 string trem function

        String trem = "      somanth        ";
        String value3 = trem.trim();
        System.out.println(value3);
        // Method 5 string substring function

        String subString = "somanth";
        String value4 = subString.substring(2);
        System.out.println(value4);
        // Method 6 string replace function

        String replString = "somanth";
        String value5 = replString.replace("n","h");
        System.out.println(value5);
        // Method 7 string replace function

        // String name6 = "somanth";
        // String value6 = name6.startsWith("som")
        // System.out.println(value6);

      String name7= "londhe";
      System.out.println(name7.charAt(name));
      System.out.println(name7.indexOf("d"));
      System.out.println(name7.lastIndexOf("h"));
     System.out.println(name7.equals("londhe"));
     System.out.println(name7.equalsIgnoreCase("londHE"));
    }
}
