
public class CoffeeBuilderPattern {
		
	
		private String size;
		private boolean lactose;
		private boolean soft;
		
		
		public String getSize() {
			return size;
		}

		public boolean isSoft() {
			return soft;
		}
		
		public boolean isLactose() {
			return lactose;
		}

		//----------------------------------------------------------------------	
		public static class Builder{
			
			private final String size;
			private boolean lactose = false;
			private boolean soft = false;
		
			public Builder(String size) {
				super();
				this.size = size;
			}

			
			public Builder isLactose(boolean Lactose) {
					lactose = Lactose;
					return this;
			}
		
			public Builder isSoft(boolean Soft) {
				soft = Soft;
				return this;
			}
		
		
			public CoffeeBuilderPattern build() {
				return new CoffeeBuilderPattern(this);
			}
		
		}
		
		public CoffeeBuilderPattern(Builder builder) {
			size = builder.size;
			lactose = builder.lactose;
			soft = builder.soft;
		}
}
