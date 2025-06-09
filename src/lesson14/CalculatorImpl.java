package lesson14;

public class CalculatorImpl implements Calculator {
	private float	value;
	
	public CalculatorImpl() {
		value = 0;
	}

	public CalculatorImpl(final float initialValue) {
		value = initialValue;
	}
	
	@Override
	public Calculator add(final Calculator another) {
		if (another == null) {
			throw new IllegalArgumentException("Attempt to add null!");
		}
		else {
			return new CalculatorImpl(another.getValue()+value);
		}
	}

	@Override
	public Calculator subtract(Calculator another) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Calculator multiply(Calculator another) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Calculator divide(Calculator another) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Calculator sqrt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getValue() {
		return value;
	}
}
