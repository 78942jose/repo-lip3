import javax.swing.JOptionPane;

public class ResultadoAluno {

	public static void main(String[] args) {
		
		double media = 5.0 ;
		
		
		if( media >= 6.0 ) {
			JOptionPane.showMessageDialog(null,
					"aprovado!");
		} else {
			JOptionPane.showMessageDialog(null,
					"reprovado!");
		}

	}

}

