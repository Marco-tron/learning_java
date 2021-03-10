package java_basics;

public class Utils {
		public static void UtilsPrinting(String a) {
			System.out.println(a);
			
			}
		
		//you can also make methods return values
		public static int add10(int Argument) {
			int result = Argument+10;
			return result;
		}
		
		// a private method can only be called inside its own class
		private static int add10private(int Argument) {
			int result = Argument+10;
			return result;
		}
}
