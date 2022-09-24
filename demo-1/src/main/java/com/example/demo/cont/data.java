package com.example.demo.cont;
import javax.persistence.*;
import lombok.*;
import lombok.Builder;
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Entity(name = "foods")

public class data {
	@Id    
	@GeneratedValue(strategy = GenerationType.IDENTITY)    
	private long id;     
	@Column(name = "name",unique = true,length =50, nullable = false)   
	private String name;
	@Column(name = "ing", length = 200, nullable = false)   
	private String ing;
	public data(String name, String ing) {
		this.name = name;
		this.ing = ing;
	}
}

