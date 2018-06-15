class Test{
	
	void freqChar(String s){
		int freq=1;
		
		for(int i = 0;i<s.length();i++){
			freq=1;
			char c = s.charAt(i);
			for(int j=i+1; j<s.length()-1;j++){
				if(c==s.charAt(j)){
					freq++;
					i++;					
				}
				else{
					break;						
				}
			}
			if(freq>1){
				System.out.print(s.charAt(i)+""+freq);
			}
			else{
				System.out.print(s.charAt(i)+"");
			}
		}
		
	}
	
}

public class Practice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbccdeefgh";
		Test t = new Test();
		 t.freqChar(s);
		
		
	/*	int freq=1;
		for(int i = 0;i<s.length();i++){
			freq=1;
			char c = s.charAt(i);
			for(int j=i+1; j<s.length()-1;j++){
				if(c==s.charAt(j)){
					freq++;
					i++;
					
				}
				else{
					
					break;	
					
				}
			}
			if(freq>1){
				System.out.print(s.charAt(i)+""+freq);
			}
			else{
				System.out.print(s.charAt(i)+"");
			}
		}
		*/
		
	}

}
