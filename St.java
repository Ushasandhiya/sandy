public class St
{
    public static void main(String[] args)
    {
        String greet = "sandhiya";
        System.out.println(" original string:" + greet);
        //returns the number of character
        System.out.println("Length:" + greet.length());
        //gives the character at index
        System.out.println("character at index 4:" + greet.charAt(4));
        //Returns a substring
        System.out.println("Substring:" + greet.substring(0,5));
        //to uppercase
        System.out.println("Uppercase:" + greet.toUpperCase());
        //to lowercase
        System.out.println("lowercase:" + greet.toLowerCase());
        //checks if it contsins the given word in the sentence
        System.out.println("contains san?:" + greet.contains("wxy"));
        //checks if its equal
        System.out.println("Equals to sandhiya?" + greet.equals("sandhiya"));
        //ignores the letter case
        System.out.println("EqualIsIgnorecase 'Sandhiya'?:" + greet.equalsIgnoreCase("Sandhiya"));
    }
}