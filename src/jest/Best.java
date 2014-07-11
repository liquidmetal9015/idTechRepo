package jest;

import javax.swing.JOptionPane;

public class Best {

	
	
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog(null, "input a thing");
		
		
		String result = "";
		int bigCount = 0;
		int smallCount = 0;
		
		while(bigCount < input.length()-1){
			
			
			if(input.charAt(bigCount)== '-'){
				
				result += Integer.toString(smallCount);
				smallCount = 0;
				bigCount++; //to skip over the '-' character
			
			}
			bigCount++;
			smallCount++;
		}
		smallCount++;
		result += Integer.toString(smallCount);
		
		
System.out.println(result);
	}

}
