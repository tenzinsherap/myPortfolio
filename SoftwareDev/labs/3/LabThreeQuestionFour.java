package labs;

public class LabThreeQuestionFour {

	public static void main(String[] args) {
	// finds the largest n such that n is a prime number and n < 15,000.
		
	int i;
	
	// Validate for loop so n is less than 15,000
	for(i=14999;i>0;i--){
		int y = 0;
		for(int j=1;j<=i;j++) {
		if(i%j==0)
	{
			y++;
		}
	}
		if(y==2)
		break;
	}
		System.out.println("Largest N: "+i);

		}

	}


