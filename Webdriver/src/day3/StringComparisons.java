package day3;

public class StringComparisons {

	public static void main(String[] args) {
		String str1="Selenium";
		String str2="Selenium";
		if(str1.equals(str2))
		{
			System.out.println("String are same");
		}
		else
		{
			System.out.println("String are different");
		}
		System.out.println("######################");
		String str3="selenium";
		String str4="Selenium";
		if(str3.equalsIgnoreCase(str4))
		{
			System.out.println("String are same");
		}
		else
		{
			System.out.println("String are different");
		}
		System.out.println("#####################");
		String str5="Selenium is a free sw";
		String str6="Selenium";
		if(str5.contains(str6))
		{
			System.out.println("Element present");
		}
		else
		{
			System.out.println("Element not present");
		}

	}

}
