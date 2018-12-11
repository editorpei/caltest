package com.maven.calculator.calculator_Tong;

public class CalculatorAdvancedOperations {
	int OpMode; //5,6,7,8,9,10 equal to  sinx, cos, x2, x3, abs(x),1/x 0 equal NULL
	double a;
	

	public double advFunc(){
		double  result=0;
				switch(OpMode){
				case 5:result=Math.sin(a);	
				break;
				case 6:result=Math.cos(a);
				break;
				case 7:result=a*a;			
				break;
				case 8:result=a*a*a;		
				break;
				case 9:result=Math.abs(a);	
				break;
				case 10:
					if(0!=a)
					{result=1/a;			
					break;}
				    
				default: result=0;
				break;
	          }
		
		return result;
	}
		
			

}
