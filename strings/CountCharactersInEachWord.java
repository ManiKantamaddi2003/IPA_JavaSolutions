package strings;

public class CountCharactersInEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="manikanta maddi doshna naga veera bhavani";
		String namesplit[]=str.trim().split("\\s+");
		for(String word:namesplit)
		{
			System.out.print(word+word.length()+" ");
		}
		

	}

}
