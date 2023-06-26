package PractiseCoding;

public class StringWhiteSpace {

     public String checkWhiteSpace(String value) {

    	 StringBuffer string = new StringBuffer();

    	 char[] charArray = value.toCharArray();

    	 for(int i=0;i<=value.length()-1;i++) {
    		 if(Character.isWhitespace(charArray[i])) {

    		 }
    		 else {
    			 string.append(charArray[i]);
    		 }
    	 }

    	 return string.toString();

     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringWhiteSpace obj = new StringWhiteSpace();

	   System.out.println(obj.checkWhiteSpace("h e l l o"));


	}

}
