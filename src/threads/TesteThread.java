package threads;

public class TesteThread {

	public static void main(String[] args) {

		// Executando várias threads em tempos diferentes( Sleep time em milisegundos )

		MinhaThreadRunnable t1 = new MinhaThreadRunnable("#1", 900);
		MinhaThreadRunnable t2 = new MinhaThreadRunnable("#2", 800);
		MinhaThreadRunnable t3 = new MinhaThreadRunnable("#3", 700);
		MinhaThreadRunnable t4 = new MinhaThreadRunnable("#4", 600);
		MinhaThreadRunnable t5 = new MinhaThreadRunnable("#5", 500);
		MinhaThreadRunnable t6 = new MinhaThreadRunnable("#6", 400);

	}

}
