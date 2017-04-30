package design.pattern.builder;

public class Sandwich {

	private String bread;
	private String meat;
	private String topping;
	private String sauce;

	public static class SandwichBuilder {
		private String bread;
		private String meat;
		private String topping;
		private String sauce;

		public SandwichBuilder() {

		}

		public SandwichBuilder bread(String bread) {
			this.bread = bread;
			return this;
		}

		public SandwichBuilder meat(String meat) {
			this.meat = meat;
			return this;
		}

		public SandwichBuilder topping(String topping) {
			this.topping = topping;
			return this;
		}

		public SandwichBuilder sauce(String sauce) {
			this.sauce = sauce;
			return this;
		}

		public Sandwich build() {
			return new Sandwich(this);
		}
	}

	// using the builder to create the complex object as per need
	private Sandwich(SandwichBuilder builder) {
		this.meat = builder.meat;
		this.bread = builder.bread;
		this.sauce = builder.sauce;
		this.topping = builder.topping;
	}

	public String getBread() {
		return bread;
	}

	public String getMeat() {
		return meat;
	}

	public String getTopping() {
		return topping;
	}

	public String getSauce() {
		return sauce;
	}
}
