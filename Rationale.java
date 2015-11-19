public class Rationale {
    private int n;
    private int d;
    public Rationale() {
	n = 0;
	d = 1;
    }
    public Rationale(int num, int den) { 
	if (d == 0) {
	    n = 0;
	    d = 1;
	    }
	else {
	    n = num;
	    d = den;
	}
    }

    public String toString() {
	String rationalNum = "";
	rationalNum += ((double)this.n)/this.d;
	return rationalNum; 
	}
  		       
    public static void main(String[] args) {
	Rationale r = new Rationale(1,1); 
	System.out.print(r);
    }
}


	    
	    
	    
	

	
		
    
