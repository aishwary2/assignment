package testjunitfivee;

public class Calculator {

	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	public int add(String string) {
		// TODO Auto-generated method stub
		if(string=="")
			return 0;
		else
			return Integer.parseInt(string);
	}

	public int add(int i, String string, int j) {
		// TODO Auto-generated method stub
		if(string=="\n")
			return i+j;
		else
			return i+j;
	}

}
