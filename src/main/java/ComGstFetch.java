import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ComGstFetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Gst gst =entityManager.find(Gst.class, 2);
		if(gst!=null) {
			System.out.println("the gst id is:"+gst.getId());
			System.out.println("the gst num is:"+gst.getNum());
			System.out.println("the status of gst:"+gst.getStatus());
			System.out.println();
			Company company= gst.getCompany();
			if(company!=null) {
				System.out.println("the company id is:"+company.getId());
				System.out.println("the company address is:"+company.getAddress());
				System.out.println("the company name is:"+company.getName());
			}
		}else {
			System.out.println("not found data");
		}

	}

}
