package test.problems;
public class WordReverse {


	public static void main(String[] args) {
		String str = "I Love Java";
		reverse(str);

	}

	private static void reverse(String aStr) {
		char [] buffer = aStr.toCharArray();
		reverseChars(buffer,0,buffer.length);
		System.out.println(new String(buffer));

		int wordEnd = 0;
		for(int wordStart=0;wordEnd<buffer.length;wordStart++){
			while(wordEnd<buffer.length && buffer[wordEnd] != ' '){
				wordEnd++;
			}
			
			reverseChars(buffer,wordStart,wordEnd);
			wordStart=wordEnd++;
		}
		System.out.println(new String(buffer));


	}

	private static void reverseChars(char[] buffer, int start, int end) {

		for(int i=start,j = end-1;i<j ;i++,j--){
			char c = buffer[i];
			buffer[i]=buffer[j];
			buffer[j]=c;

		}

	}

}
