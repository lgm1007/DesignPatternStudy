package creational.factory_methods;

public abstract class MechineFactory {
	private Parts parts;

	// 해당 메서드가 팩토리 메서드
	abstract protected Parts createParts();

	public MechineFactory() {
		System.out.println(this.getClass());
		Parts parts = createParts();
	}

	public Parts getParts() {
		return parts;
	}
}
