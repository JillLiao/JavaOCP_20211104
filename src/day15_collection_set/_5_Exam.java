package day15_collection_set;

import java.util.Objects;

public class _5_Exam {
	private String name;
	private Integer score;
	
	public _5_Exam() {		
	}
	
	public _5_Exam(String name, Integer score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "_5_Exam [name=" + name + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		_5_Exam other = (_5_Exam) obj;
		return Objects.equals(name, other.name) && score == other.score;
	}
}
