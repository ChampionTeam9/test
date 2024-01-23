package sg.edu.nus.goldlake.interfacemethods;

import sg.edu.nus.goldlake.model.Product;
import java.util.List;

public interface ProductInterface {
	public boolean saveProduct(Product product);

	public List<Product> SearchProductByName(String name);

	public List<Product> SearchProductByCategory(String category);
}
