import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class test {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		System.out.println(factory);
	}
}
