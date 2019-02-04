
public class Encryption {
	
	int key = 5;
	int message = 1633738;
	int tempKey = key;
	
	public int encryption(int number){
		String str = Integer.toString(number);
		int encryptedMessage = 0;
		
		for(int i = 0; i < str.length(); i++){
			encryptedMessage = (encryptedMessage * 10) + (Character.getNumericValue(str.charAt(i)) + tempKey) % 9;
			tempKey++;
		}
		System.out.println("Encrypted Message : "+encryptedMessage+" , with KEY : "+key);
		return encryptedMessage;
	}
	
	public void decryption(int number){
		tempKey = key;
		String str = Integer.toString(number);
		
		int decryptedMessage = 0;
		
		for (int i = 0; i < str.length(); i++){
			int tempAnswer = (Character.getNumericValue(str.charAt(i)) + 9 - tempKey);
			while(tempAnswer < 0){
				tempAnswer += 9;
			}
			decryptedMessage = (decryptedMessage * 10) + tempAnswer % 9;
			tempKey++;
		}
		System.out.println("Decrypted Message : "+decryptedMessage+" , with KEY : "+key);
	}
	
	public static void main(String[] args) {
		Encryption obj = new Encryption();
		int e;
		
		System.out.println("Original Message : "+obj.message+" , and the given key is : "+obj.key);
		e = obj.encryption(obj.message);
		obj.decryption(e);
	}
}
