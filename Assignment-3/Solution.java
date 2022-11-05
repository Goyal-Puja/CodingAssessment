import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Sentence (any English sentence)");
		String sentence = scanner.nextLine();
		System.out.println("Enter a Letter (any letter from A to Z)");
		String letter = scanner.nextLine();
		
		int index = sentence.indexOf(letter);
		if(index == -1) {
			System.out.println("The letter does not exist in the sentence");
		}else {
			System.out.println(sentence.substring(index+1));
		}

	}

}
/*Output

Enter a Sentence (any English sentence)
Hello World!
Enter a Letter (any letter from A to Z)
r
ld!

*/