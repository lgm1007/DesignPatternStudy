package creational.factory_methods;

public class BetaFactory extends MechineFactory {
	@Override
	public Parts createParts() {
		return new BetaParts();
	}
}
