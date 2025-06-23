package lesson14;

/**
 * <p>Thuis interface descrifkjdlfgk</p>
 * @author student
 * @since 0.0.1
 * @see http:/klfgjdfg;d;fg
 */
public interface Calculator {
	/**
	 * <p>Adds current value with another ans return result</p>
	 * @param another value to add. Can not be null.
	 * @return sum of the current value and another value
	 * @throws IllegalArgumentException when another parameter is null
	 */
	Calculator add(Calculator another) throws IllegalArgumentException;
	Calculator subtract(Calculator another);
	Calculator multiply(Calculator another);
	Calculator divide(Calculator another);
	/**
	 * <p>CAlculates square root and returns result {@linkplain Math#sqrt(double)}</p>
	 * @return square root calculated.
	 * @throws IllegalArgumentException when attempt to get square root from negative float
	 * @see Math#sqrt(double)
	 */
	Calculator sqrt() throws IllegalArgumentException;
	float getValue();
}
