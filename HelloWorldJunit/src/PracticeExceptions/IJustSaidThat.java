package PracticeExceptions;

class IJustSaidThat extends Exception
{
	int a;
	IJustSaidThat(int b){
		a=b;
	}
	public String toString() {
		return("Exception number: "+a);
	}
}