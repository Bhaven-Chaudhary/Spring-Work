package productcurdapp.controller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcurdapp.dao.ProductDao;
import productcurdapp.model.Product;

@Controller
public class MainController {
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/")
	public String home(Model model) {
		
		List<Product> products = productDao.getAllProduct();
		model.addAttribute("products", products);
		return "index";
	}

	@RequestMapping("/add-product")
	public String addProductForm(Model model) {
		model.addAttribute("title", "Add Product Form");
		return "addProductForm";
	}
	
	@RequestMapping(value="/handle-product", method= RequestMethod.POST)
	public RedirectView handelProduct(@ModelAttribute Product product, HttpServletRequest request){
		System.out.println(product);
		productDao.createProduct(product);
		RedirectView redirect = new RedirectView();
		redirect.setUrl(request.getContextPath()+"/");
		return redirect;
	}

	@RequestMapping("/delete/{pId}")
	public RedirectView delete(@PathVariable("pId") int pId ,HttpServletRequest request){
		
		productDao.delete(pId);
		RedirectView redirect = new RedirectView();
		redirect.setUrl(request.getContextPath()+"/");
		return redirect;
	}
	
	@RequestMapping("/update/{pId}")
	public String update(@PathVariable("pId") int pId , Model model){

		Product product = productDao.getProduct(pId);
		model.addAttribute("product", product);
		return "updateForm";
	}
	
}
