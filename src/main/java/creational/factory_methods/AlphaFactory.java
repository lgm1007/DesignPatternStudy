package creational.factory_methods;

public class AlphaFactory extends MechineFactory {
	@Override
	public Parts createParts() {
		return new AlphaParts();
	}
}
