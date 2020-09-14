import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ProductMaintenanceApp {
    public static void main(String[] args) {
        JFrame frame = new ProductMaintenanceFrame();
        frame.setVisible(true);
    }
}

class ProductMaintenanceFrame extends JFrame {
    public ProductMaintenanceFrame() {
        setTitle("Product Display");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new ProductMaintenancePanel());
        this.pack();
        centerWindow(this);
    }

    private void centerWindow(Window w) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        setLocation((d.width - w.getWidth()) / 2, (d.height - w.getHeight()) / 2);
    }
}

class ProductMaintenancePanel extends JPanel {
    ProductDAO productDAO;
    ArrayList<Product> products;
    Product newProduct = null;

    ProductSelectorPanel selectorPanel;
    ProductDisplayPanel productPanel;
    ProductButtonPanel buttonPanel;

    public ProductMaintenancePanel() {
//        fill the products ArrayList
        productDAO = DAOFactory.getProductDAO();
        products = productDAO.getProducts();
//        add the panels
        setLayout(new GridBagLayout());
        selectorPanel = new ProductSelectorPanel();
        add(selectorPanel, getConstraints(0, 0, 1, 1, GridBagConstraints.EAST));
        productPanel = new ProductDisplayPanel();
        add(productPanel, getConstraints(0, 1, 1, 1, GridBagConstraints.EAST));
        buttonPanel = new ProductButtonPanel();
        add(buttonPanel, getConstraints(0, 2, 1, 1, GridBagConstraints.EAST));
//        set the initial product to be displayed
    }
}




