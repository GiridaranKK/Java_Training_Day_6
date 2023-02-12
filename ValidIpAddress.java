public class ValidIpAddress {

	public static void main(String[] args) {
		String[] ipAddress = {"192.168.0.1","192.168.1.254","10.9898.0.138","200.2000.200.5","127.0.0.1"};
		int count = 0;
		for(int i =0 ; i < ipAddress.length ; i++) {
			if(ipAddress[i].length() <= 15) {
				String[] res = ipAddress[i].split("[.]", 0);
				int ok = 0;
				for(int j = 0; j <= 3 ; j++) {
					int number = Integer.parseInt(res[j]);
					if(number >= 0 && number <= 255 ) {
						ok++;
					}
					else {
						break;
					}
				}
				if(ok == 4) {
					System.out.println(ipAddress[i]);
					count++;
				}
			}
		}
		System.out.println("The count is : "+ count);
	}

}

//Output:
	//192.168.0.1
	//192.168.1.254
	//127.0.0.1
	//The count is : 3
