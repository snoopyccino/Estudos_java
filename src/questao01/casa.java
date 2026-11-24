package questao01;

public class casa {
	 
	private String endereco;
	private String cidade;
	private int quantQuartos;
	private int quantBanheiros;
	private int quantSalas;
	private double areaConstruida;

	public casa(String end) {
		this.endereco = end;
	}
	
	
	
	public casa() {
		super();
		this.endereco = "sa";
		this.cidade = "sa";
		this.quantQuartos = 1;
		this.quantBanheiros = 1;
		this.quantSalas = 2;
	}
	
	public void MostrarCasa() {
		System.out.print("Endereço: " + this.endereco);
		System.out.print("\nCidade: " + this.cidade );
		System.out.print("\nQuant. Quartos: " + this.quantQuartos);
		System.out.print("\nQuant. Banheiros: " + this.quantBanheiros);
		System.out.print("\nQuant. de Salas: " + this.quantSalas);
		System.out.print("\narea Construida: " + this.areaConstruida);
	}
	
	
	
}
