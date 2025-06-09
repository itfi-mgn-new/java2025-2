package lesson14;

public interface Calculator {
	Calculator add(Calculator another);
	Calculator subtract(Calculator another);
	Calculator multiply(Calculator another);
	Calculator divide(Calculator another);
	Calculator sqrt();
	float getValue();
}
