package sg.edu.nus.goldlake.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sg.edu.nus.goldlake.interfacemethods.ProductInterface;
import sg.edu.nus.goldlake.service.ProductImplementation;

@Controller
public class ProductController {
	@Autowired
	private ProductInterface pservice;

	@Autowired
	public void setProductService(ProductImplementation pserviceImpl) {
		this.pservice = pserviceImpl;
	}
  //public ProductImplementation pserviceImpl;

	@RequestMapping("/")
	public String getSearchPage(Model model) {
		return "searchProducts";
	}

	@RequestMapping(value = "/all/product/searching")
	public String search(@RequestParam("keyword") String k, @RequestParam("searchtype") String t, Model model) {
		String name = new String("name");
		String catagory = new String("category");
		if (t.equals(name)) {
			model.addAttribute("products", pservice.SearchProductByName(k));
		} else if (t.equals(catagory)) {
			model.addAttribute("products", pservice.SearchProductByCategory(k));
		} else {
			return "error";
		}
		return "searchResults";
	}
}