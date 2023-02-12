public class StringMethods {
	public static void main(String[] args) {
		String s = "hellolloo";
		String s1 = "helllloo";
		System.out.println(s.toCharArray());
		System.out.println(s.indexOf('l'));
		System.out.println(s.lastIndexOf('l'));
		System.out.println(s.contains("g"));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.length());
		System.out.println(s.trim());
		System.out.println(s.substring(5));
		System.out.println(s.subSequence(1, 5));
		System.out.println(s.replace('o', 'k'));
		System.out.println(s.replace('l','k'));
		System.out.println(s.replaceFirst("l", "k"));
		System.out.println(s.replaceAll("o", "m"));
		System.out.println(s.isEmpty());
		System.out.println(s.valueOf(true));
		System.out.println(s.getBytes());		
	}
}


//Output:
	//hellolloo
	//2
	//6
	//false
	//false
	//9
	//hellolloo
	//lloo
	//ello
	//hellkllkk
	//hekkokkoo
	//heklolloo
	//hellmllmm
	//false
	//true
	//[B@2e5c649
