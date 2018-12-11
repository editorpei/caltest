package com.maven.calculator.calculator_Tong;


	
	public  class CalculatorBasicOperations implements CalculatorBasicOperationsInterface {
		int basicOperationMode; //1,2,3,4 equal to  +, -, x, / 0 equal NULL
		double a;
		double b;

		public double basicFunc(){
			double result;
					switch(this.basicOperationMode){
					case 1:result=this.a+this.b;
					break;
					case 2:result=this.a-this.b;
					break;
					case 3:result=this.a*this.b;
					break;
					case 4:// make sure b is not ZERO
						  if(0!=b)
						   {result=this.a/this.b;break;}
						  
					default: result=0;
					break;
		}
			
			return result;
		}

		}


