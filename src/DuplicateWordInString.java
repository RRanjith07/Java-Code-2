import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "Hey How How are you Hey";
		String[] words=sentence.split(" ");
		Map<String, Integer>sMap = new HashMap<String, Integer>();
		for(String word :words)
		{
			if(sMap.containsKey(word))
			{
				sMap.put(word, (sMap.get(word))+1);
			}
			else {
				sMap.put(word, 1);
			}
		}
		System.out.println(sMap);
		
		Set<String> wordsString = sMap.keySet();
		for(String word:wordsString)
		{
			if(sMap.get(word)>1)
			{
				System.out.print(word+" = "+sMap.get(word));
			}
		}
		
		
		
	}

}
