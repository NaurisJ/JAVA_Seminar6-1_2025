package lv.venta.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lv.venta.model.enums.Degree;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "ProfessorTable")//MYSQL - professor_table
@Entity
public class Professor extends Person {
	@Setter(value = AccessLevel.NONE)
	@Column(name = "PId")//MYSQL - p_id
	@Id //ka primārā atslēga (PK)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pid;
	
	
	@NotNull
	@Column(name = "Degree")//MYSQL - degree
	private Degree degree;
	
	@ToString.Exclude
	@OneToOne(mappedBy = "professor")//otras klases mainīgaa noasukums, uz kuru ir JoinColumn
	private Course course;
	
	
	
	public Professor(String name, String surname, Degree degree) {
		super(name, surname);
		setDegree(degree);
	}
	
}