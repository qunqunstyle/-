import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Y1081 {
	public static void main(String[] args)throws Exception {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bReader.readLine());
		String[] password = new String[num];	
		for (int i = 0; i < num; i++) 
			password[i] = bReader.readLine();
		bReader.close();
		
		Loop:for (int i = 0; i < num; i++) {
			if (password[i].length() < 6) {
				System.out.println("Your password is tai duan le.");
				continue Loop;
			}			
			else {
				int number = 0;//判断数字个数
				int word = 0;//判断字母个数
				for (int j = 0; j < password[i].length(); j++) {
					char temp = password[i].charAt(j);
					if (temp < '.' || (temp > '.' && temp < '0') || (temp > '9' && temp < 'A')
							|| (temp > 'Z' && temp < 'a') || temp > 'z') {
						//若存在其他字符
						System.out.println("Your password is tai luan le.");
						continue Loop;
					}											
					else if (number == 0 && temp <= '9' && temp >= '0')
						number++;
					else if (word == 0 && ((temp <= 'Z' && temp >= 'A') || (temp <= 'z' && temp >= 'a')))
						word++;
				}
				if(number == 0) {
					System.out.println("Your password needs shu zi.");
					continue Loop;
				}	
				else if (word == 0) {
					System.out.println("Your password needs zi mu.");
					continue Loop;
				}				
				else 
					System.out.println("Your password is wan mei.");										
			}
		}
	}
}
