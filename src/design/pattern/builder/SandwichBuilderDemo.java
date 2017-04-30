package design.pattern.builder;

import design.pattern.builder.Sandwich.SandwichBuilder;

public class SandwichBuilderDemo {

	public static void main(String[] args) throws Exception {

		SandwichBuilder builder = new Sandwich.SandwichBuilder();
		builder.bread("brown").meat("chicken");

		Sandwich sandwich = builder.build();

		System.out.println("Bread for the sandwich is: " + sandwich.getBread());
		System.out.println("Meat for the sandwich is: " + sandwich.getMeat());
		System.out.println("Topping for the sandwich is: " + sandwich.getTopping());
	}

}