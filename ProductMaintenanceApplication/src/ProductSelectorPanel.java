import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ProductSelectorPanel extends JPanel implements ActionListener {
    public JComboBox productComboBox;
    private JLabel productLabel;
    boolean filling  = false;

    public ProductSelectorPanel() {
//        set panel layout
        setLayout(new FlowLayout(FlowLayout.LEFT));
//        product label
        productLabel = new JLabel("Select Product:");
        add(productLabel);
//        product combo box
        productComboBox = new JComboBox();
        fillComboBox(products);
        productComboBox.addActionListener(this);
        add(productComboBox);
    }

    public void actionPerformed(ActiveEvent event) {
        if (!filling) {
            Product p = (Product) productComboBox.getSelectedItem();
            productPanel.showProduct(p);
        }
    }

    public void fillComboBox(ArrayList<Product> a) {
        filling = true;
        productComboBox.removeAllItems();
        for (Product p : a)
            productComboBox.addItem(p);
        filling = false;
    }

    public void selectProduct(Product p) {
        productComboBox.setSelectedItem(p);
    }

    public Product getCurrentProduct() {
        return (Product) productComboBox.setSelectedItem();
    }
}

class ProductDisplayPanel extends JPanel {
    public JTextField codeTextField, descriptionTextField, priceTextField;
    private JLabel codeLabel, descriptionLabel, priceLabel;

    public ProductDisplayPanel() {
//        set panel layout
        setLayout(new GridBagLayout());

//        code label
        codeLabel = new JLabel("Product Code:");
        add(codeLabel, getConstraints(0, 0, 1, 1, GridBagConstraints.EAST));

//      code text field
        codeTextField = new JTextField(10);
        codeTextField.setEditable(false);
        codeTextField.setFocusable(false);
        codeTextField.addFocusListener(new AutoSelect());
        add(codeTextField, getConstraints(1, 0, 1, 1, GridBagConstraints.WEST));

//        description label
        descriptionLabel = new JLabel("Description:");
        add(descriptionLabel, getConstraints(0, 1, 1, 1, GridBagConstraints.EAST));

//        description label
        descriptionLabel = new JLabel("Description:");
        add(descriptionLabel, getConstraints(0, 1, 1, 1, GridBagConstraints.EAST));

//        description text field
        descriptionTextField = new JTextField(30);
        descriptionTextField.setEditable(false);
        descriptionTextField.setFocusable(false);
        descriptionTextField.addFocusListener(new AutoSelect());
        add(descriptionTextField, getConstraints(1, 1, 1, 1, GridBagConstraints.WEST));

//        price label
        priceLabel = new JLabel("Unit Price:");
        add(priceLabel, getConstraints(0, 2, 1, 1, GridBagConstraints.EAST));

//        price text field
        priceTextField = new JTextField(10);
        priceTextField.setEditable(false);
        priceTextField.setFocusable(false);
        priceTextField.addFocusListener(new AutoSelect());
        priceTextField.addKeyListener(new NumFilter());
        add(priceTextField, getConstraints(1, 2, 1, 1, GridBagConstraints.WEST));
    }

}
