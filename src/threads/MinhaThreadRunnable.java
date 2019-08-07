package threads;

public class MinhaThreadRunnable implements Runnable {

	// Atributos
	private String nome;
	private int tempo;

	// Construtor
	public MinhaThreadRunnable(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		Thread t = new Thread(this);
		t.start();
	}

	// Método da interface
	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {

			System.out.println(nome + " contador " + i);
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println(nome + " terminou a execução!");
	}

}
