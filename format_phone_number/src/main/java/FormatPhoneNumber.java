public class FormatPhoneNumber {

    public String removeNonDigit(String input) {
        String[] digits = input.split("[^0-9]");
        String digit ="";
        for(String s : digits){
            digit+=s;
        }
        return digit;
    }

    public String solution(String input) {
        String digit = removeNonDigit(input);
        String formatNumber ="";
        boolean odd=false;
        for(int i=0 ; i<digit.length();i++) {
            formatNumber+=digit.substring(i,i+1);
            if(digit.length()%3==1 && i== digit.length()-3){
                formatNumber += "-";
                odd=true;
            }
            if(odd ==false &&(i+1)%3==0 &&(i+1)!=digit.length()) formatNumber += "-";
        }
        return formatNumber;
    }

}