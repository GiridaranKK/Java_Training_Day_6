public class ExtensionFilter {
	public static void main(String[] args) {
		String[] files = {"abc.pdf","bca.txt","lmn.doc","xyz.txt","jfh.ppt","shjdkk.txt","hdibk.hxt","hbb.txt"};
		for(int i =0;i<files.length;i++) {
			int h = files[i].length()-1;
			if(files[i].charAt(h) == 't' ) {
				if(files[i].charAt(h-1) =='x' ) {
					if(files[i].charAt(h-2) =='t' ) {
						if(files[i].charAt(h-3) =='.' ) {
							System.out.println(files[i] + " - " + "Allowed");
						}
						else {
							System.out.println(files[i] + " - " + "Not Allowed");
						}
					}
					else {
						System.out.println(files[i] + " - " + "Not Allowed");
					}
					
				}
				else {
					System.out.println(files[i] + " - " + "Not Allowed");
				}
				
			}
			else {
				System.out.println(files[i] + " - " + "Not Allowed");
			}
		}

	}

}

//Output:
	//abc.pdf - Not Allowed
	//bca.txt - Allowed
	//lmn.doc - Not Allowed
	//xyz.txt - Allowed
	//jfh.ppt - Not Allowed
	//shjdkk.txt - Allowed
	//hdibk.hxt - Not Allowed
	//hbb.txt - Allowed


