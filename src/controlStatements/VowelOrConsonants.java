package controlStatements;

class VowelOrConsonants {
    public static void main(String[] args) {
        char ch = 'k'; 
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        	// vowels==>( A or E or I or O or U )
             {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }
    }
}
 