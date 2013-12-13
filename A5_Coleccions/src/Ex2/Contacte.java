package Ex2;


public class Contacte implements Comparable<Contacte> {
	private String nom;
	public String pcognom;
	public String scognom;
	public String telefon;
	public String email;
	
	public Contacte(String nom, String pcognom, String scognom, String telefon,
			String email) {
		super();
		this.nom = nom;
		this.pcognom = pcognom;
		this.scognom = scognom;
		this.telefon = telefon;
		this.email = email;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPcognom() {
		return pcognom;
	}
	public void setPcognom(String pcognom) {
		this.pcognom = pcognom;
	}
	public String getScognom() {
		return scognom;
	}
	public void setScognom(String scognom) {
		this.scognom = scognom;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contacte [nom=" + nom + ", pcognom=" + pcognom + ", scognom="
				+ scognom + ", telefon=" + telefon + ", email=" + email + "]";
	}
	//Els metodes de implementar l'interface compareto
		public int compareTo(Contacte o) {
			//Ordena per Cognoms
			return  pcognom.compareTo(o.getPcognom()) ;
			
			//Ordena per nom
			// return nom.compareTo(o.getNom());
		}

	
}
