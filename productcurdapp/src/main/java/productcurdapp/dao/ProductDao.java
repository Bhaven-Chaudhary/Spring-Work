package productcurdapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import productcurdapp.model.Product;

@Component
public class ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate; 
	
	@Transactional
	public void createProduct(Product product){
	
		hibernateTemplate.saveOrUpdate(product);
	}

	public List<Product> getAllProduct(){
		List<Product> products = hibernateTemplate.loadAll(Product.class);
		return products;
	}
	
	public Product getProduct(int pid){
		Product product = hibernateTemplate.get(Product.class, pid);
		return product;
	}
	
	@Transactional
	public void delete(int pid){
		Product p = hibernateTemplate.load(Product.class, pid);
		hibernateTemplate.delete(p);
	}
	
	@Transactional
	public void update(Product product){
		
		hibernateTemplate.update(product);
	}
	
	
}
