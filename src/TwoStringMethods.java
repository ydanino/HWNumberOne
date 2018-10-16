public class TwoStringMethods {

    public static String alternateStrings(String a, String b) {
        String finalWord = "";
        int smallerString = 0 ;

        if(a.length() > b.length()){
             smallerString = b.length();
        }else{
            smallerString = a.length();
        }

        for (int i = 0; i < smallerString; i++) {
            finalWord = finalWord + a.substring(i, i+1) + b.substring(i , i+1);
        }

        if(a.length() > b.length() ) {
            finalWord = finalWord + a.substring(smallerString);
        }else{
            finalWord = finalWord + b.substring(smallerString);
        }

        return finalWord;
    }

    public static boolean abcTest(String phrase) {
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.substring(i, i + 1).equals("a")) {
                if(i>1) {
                    if (!(phrase.substring(i - 1, i).equals("."))) {
                        if (phrase.substring(i + 1, i + 2).equals("b")) {
                            if (phrase.substring(i + 2, i + 3).equals("c")) {
                                return true;
                            }
                        }
                    }
                }else {
                    if (phrase.substring(i + 1, i + 2).equals("b")) {
                        if (phrase.substring(i + 2, i + 3).equals("c")) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
