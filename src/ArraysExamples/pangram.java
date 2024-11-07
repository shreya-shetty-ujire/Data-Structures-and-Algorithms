package ArraysExamples;



public class pangram {
    public static void main(String[] args){
        String str="thequickbrownfoxjumpsoverthelazydog";


        System.out.println(checkIfPangram(str));
    }
    static boolean checkIfPangram(String sentence) {
        boolean[] letters  = new boolean[26];

        for(char c : sentence.toCharArray()) {
            letters[c - 'a'] = true;
        }

        //find any letter that not exist
        for(boolean existLetter : letters) {
            if(!existLetter) return false;
        }

        return true;
    }
}
