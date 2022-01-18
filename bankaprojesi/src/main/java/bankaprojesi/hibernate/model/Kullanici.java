package bankaprojesi.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JavaBank")
public class Kullanici {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="musteri_id")
	private long id;
	@Column(name="musteri_isim")
	private String firstName;
	@Column(name="musteri_soyisim")
	private String lastName;
	@Column(name="musteri_sifre")
	private int sifre;
	
	
	public Kullanici() {
	}
	public Kullanici( String firstName, String lastName, int sifre) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.sifre = sifre;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSifre() {
		return sifre;
	}
	public void setSifre(int sifre) {
		this.sifre = sifre;
	}
	@Override
	public String toString() {
		return "Kullanici [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", sifre=" + sifre + "]";
	}
	
}
