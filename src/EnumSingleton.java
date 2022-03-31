import java.util.HashMap;

public enum EnumSingleton implements Order{
	
	INSTANCE;
	private HashMap<Object,Object> map = new HashMap<Object,Object>();

	@Override
	public void buy(Object key, Object value) {
		
		map = new HashMap<Object,Object>();
	}
	
	@Override
	public Object get(Object key) {
			return map.get(key);
	}

	

}
