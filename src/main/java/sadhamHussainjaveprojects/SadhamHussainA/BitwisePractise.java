package sadhamHussainjaveprojects.SadhamHussainA;

public class BitwisePractise {
	
	public static void main(String[] args) {
		
		Integer google=143,yahoo=123,webBrowser=432;
		
		System.out.println(google&124);
		
        System.out.println(yahoo^'D');
        
        System.out.println(webBrowser|23);
	}

}

/*
1024  512  256   128   64   32  16   8   4  2   1
       0     0   0      1    0    0   0   1    1  1  1 ==== 143
    	0     0   0     0     1    1   1   1   1   0  0 ===== 124
    	0     0   0     0     0    0   0   1   1   0   0====12 
    	
    	
  0    0     0    0     1    1    1    1   0  1  1 ======123
  0    0     0    0     1    0    0     0   1  0  0 =====68
  0    0      0    0     0    1   1    1   1   1  1 ====63
  
  
 0    0      1     1     0    1   1    0   0   0   0  =====432
 0    0     0      0     0    0    1    0   1  1  1  ======23
 
 0     0    1       1    0    1    1     0   1  1 1 ===== 439
    */