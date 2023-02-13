
public class MethodsCreation {

	public static void main(String[] args) {
     
		MethodsCreation d = new MethodsCreation();
		String name = d.getData();
		System.out.println(name);
		MethodsCreation2 d1 = new MethodsCreation2();
		d1.getUserData();
		getData2();         

		
	}
	public String getData(){
		System.out.println ("hello world");
		return "new method";
		}
		public static String getData2() {
		System.out.println ("hello world");
		return "new method"; 
		}  


}
