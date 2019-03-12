package enumProgram;

	public enum month{
		JANUARY("January",31),
		FEBRUARY("February",28),
		MARCH("March",31),
		APRIL("April",30),
		MAY("May",31),
		JUNE("June",30),
		JULY("July",31),
		August("August",31),
		SEPTEMBER("September",30),
		OCTOBER("October",31),
		NOVEMBER("November",30),
		DECEMBER("December",31);
		
		private final String monthName;
	    private final int days;
	    public static String k;
	    public static int j=0;
	    public static int x=0;
	    public static int n;
		public String getMonthName() {
			return monthName;
		}
		public int getDays() {
			return days;
		}
		private month(String monthName, int days) {
			this.monthName = monthName;
			this.days = days;
		}
	   
		static month []months=month.values();
		
		public static String search(String s) {
			
			
			
			for (month m:months ) {
				if (m.getMonthName().substring(0,3).equals(s)) {
		            k=m.getMonthName();
		            
		            
		        }
				
				
			}
			return k;
			
		}
		
		public static int count(int p) {           //Find days wise
			for (month m:months ) {
				
		           if(m.getDays()==p) {
		        	   
		        	j++;  
		           }
		           
			}
		            
			return j;
			   
		        }
		
		public static int S_count(String r) {     // find string wise
			for (month m:months ) {
				
		           if(m.getMonthName().equals(r)) {
		        	   n=m.getDays();  
		        }
		           
			}
			
			for (month m:months ) {
				
		           if(m.getDays()==n) {
		        	   
		        	x++;  
		           }
		           
			}
		            
			return x;
			   
		        }
	
		
		public static String find(String s) {
	
			for (month m:months ) {
				if (m.getMonthName().equals(s)) {
		           k=m.getMonthName().substring(0,3);
		            
		            
		        }
				
				
			}
			return k;
			
		}
	
		}
		

