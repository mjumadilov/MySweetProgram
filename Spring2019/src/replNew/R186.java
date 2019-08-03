package replNew;

import java.util.ArrayList;

public class R186 {

	

		//create your method below
		public static void combineAL(ArrayList<String>[] args) {

			ArrayList<String>wordList1 = new ArrayList<>();
			ArrayList<String>wordList2 = new ArrayList<>();
			
			wordList1.addAll(wordList2);
			System.out.println(wordList1);
		}
		public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2) {

	        ArrayList<String> List1 = new ArrayList<>(wordList1);
	        ArrayList<String> List2 = new ArrayList<>(wordList2);
	        List1.addAll(List2);
	        return List1;
	}

	}