package Ex4;

public class Carta {
	
		public String numeroC;
		public String palC;
		
		public Carta(String pals, String cartes) {
			super();
			this.numeroC = pals;
			this.palC = cartes;
		}

		public String getNumeroC() {
			return numeroC;
		}

		public void setNumeroC(String numeroC) {
			this.numeroC = numeroC;
		}

		public String getPalC() {
			return palC;
		}

		public void setPalC(String palC) {
			this.palC = palC;
		}

		@Override
		public String toString() {
			return "\n Carta: " + palC + " de " + numeroC;
		}
		
		

}
