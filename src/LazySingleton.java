import java.util.HashMap;

public class LazySingleton implements Order {


	private HashMap<Object,Object> map;
	
	private static LazySingleton instance;
	
	
	private LazySingleton() {
		
		map = new HashMap<Object,Object>();
	
	}
	
	@Override
	public void buy(Object key, Object value) {
		
		map = new HashMap<Object,Object>();
	}
	
	@Override
	public Object get(Object key) {
			return map.get(key);
	}
	
	public static LazySingleton getInstance() {
		
		if(instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
