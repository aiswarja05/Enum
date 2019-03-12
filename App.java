package enumProgram;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	 String check = month.search("Apr"); 
	 
	 System.out.print(check);
	 System.out.print("\n");
	 if (check==null) {
		    System.out.println( "The value is not found!" );
		} 
		else {
		    System.out.println( "The value is found!" );
		}  
	/*Boolean check=month.search("January");
	if (check) {
	    System.out.println( "The value is found!" );
	} 
	else {
	    System.out.println( "The value is not found!" );
	}  
	 */
}
}