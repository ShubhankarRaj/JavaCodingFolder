package SCJPTestSat;


	public class Animal extends Creature {
	    public Animal(int anyThing) {
	       super(anyThing);
	    	this.wingCount = 0;
	    }
	    public static void main(String args[]) {
	        String str = null;
	       System.out.println(str.length);
	        if (str==null) {
	            System.out.print("1");
	        } else if (str.length() == 0) {
	            System.out.print("2");
	        } else {
	            System.out.print("3");
	        }
	    }

	}
