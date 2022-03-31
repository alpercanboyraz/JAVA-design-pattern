
public class Main {

	public static void main(String[] args) {
		
		CoffeeBuilderPattern cf = new CoffeeBuilderPattern.Builder("tall")
				.isSoft(true)
				.isLactose(false)
				.build();
		
		System.out.println("Size : " + cf.getSize() + " - is Soft :  "+ cf.isSoft());
	
	 //-------------------------------------------
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					 Thread.sleep(1);
				}catch(InterruptedException e) {
					//
				}
					System.out.println("HashCode of Lazy: " + LazySingleton.getInstance().hashCode() ); 
					System.out.println("HashCode of Enum: " + EnumSingleton.INSTANCE.hashCode() ); 
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("HashCode of Lazy: " + LazySingleton.getInstance().hashCode() ); 
				System.out.println("HashCode of Enum: " + EnumSingleton.INSTANCE.hashCode() ); 
				
			}
		}).start();
		
	
	
	
	
	}

}
