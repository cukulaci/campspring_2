package emresaglam4207.rentACar.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "brands") // bu class bir tablodur ve ismi de brandsdir. yani postgredeki brands tablosuna
						// karşılık gelecek benim bu Brand'im
@Data // bu bir datadır benim yerime bunları koy ayrıca parametresiz contructor
		// oluşturuyor. @Getter ve @Setter'ın birleşimidir.
@AllArgsConstructor // parametreli constructor oluşturuyor.
@NoArgsConstructor // parametresiz constructor kullanabilmek içindir.
@Entity // sen bir veritabanı varlığısın yukarıdakilerden haberin olsun diyor.
public class Brand {

	@Id // veritabanında primary key alanısın demek
	@GeneratedValue(strategy = GenerationType.IDENTITY) // farklı sistemlerden veriabanımıza datalar geliyor marka
														// ekliyoruz. Bu durumda veritabınımız id yi bir bir arttırır.
														// Strategy de o demek.
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

}
