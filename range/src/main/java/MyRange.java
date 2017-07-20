public class MyRange {
    public String of(String input) {
        String s ="";
        for(int i=getFirstNumber(input); i<= getLastNumber(input) ; i++){
            s+=i;
        }
        return s;
    }

    public int getLastNumber(String input) {
        if(isก้ามปูปิด(input)) return Character.getNumericValue(input.charAt(3));
        return Character.getNumericValue(input.charAt(3))-1;
    }

    public boolean isก้ามปูปิด(String input) {
        if(input.endsWith("]")) return true;
        return false;
    }

    public int getFirstNumber(String input) {
        if(isก้ามปูเปิด(input)) return Character.getNumericValue(input.charAt(1));
        return Character.getNumericValue(input.charAt(1))+1;
    }

    public boolean isก้ามปูเปิด(String input) {
        if(input.startsWith("[")) return true;
        return false;
    }
}