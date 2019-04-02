import java.util.ArrayList;
import static java.lang.System.*;

public class StringSearchRunner
{
	public static void main(String args[])
	{
		System.out.println(StringSearch.countLetters("computerscience", "t"));
		System.out.println(StringSearch.countWords("computerscienceto", "to"));
		System.out.println(StringSearch.countLetters("supercalifragilisticexpialidocious", "s"));
		System.out.println(StringSearch.countWords("Thomas The Train", "th"));
	}
}