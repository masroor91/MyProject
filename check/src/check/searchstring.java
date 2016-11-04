package check;

public class searchstring {
	public static void searchstring(String s1, String s2, String s3){
		if(s1.contains(s2)&&s1.contains(s3)){
			if(s1.indexOf(s3)>s1.indexOf(s2)){
				System.out.println("1");
			}
			else
				System.out.println("-1");
		}
	}
	public static void main(String args[]){
		String s1="geniousRajKumarDev";
		String s2="Raj";
		String s3="Dev";
		searchstring(s1,s2,s3);
	}

}
