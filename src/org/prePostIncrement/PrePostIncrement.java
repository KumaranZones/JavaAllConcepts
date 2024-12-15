package org.prePostIncrement;

public class PrePostIncrement{
	public static void main(String[] args){
		int i = 10;
		System.out.println(i++ + 
						 ++i -	
						--i +		
						++i -	
						i++ -	
						--i	-	
						i--	-	
						++i	+	
						i++	+
						--i	+	
						i--	);	
}
}

