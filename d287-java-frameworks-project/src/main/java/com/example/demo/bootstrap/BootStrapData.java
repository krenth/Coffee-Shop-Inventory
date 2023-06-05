package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("Mocha Beans");
        o.setInv(15);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);

         */
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }


        //System.out.println(thePart.getCompanyName());

        List<OutsourcedPart> outsourcedPartsList=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        if (outsourcedPartsList.isEmpty()) {
            OutsourcedPart mochaBeans= new OutsourcedPart();
            mochaBeans.setCompanyName("Mocha Beans Company");
            mochaBeans.setName("Mocha Beans");
            mochaBeans.setInv(10);
            mochaBeans.setPrice(20.0);
            mochaBeans.setId(100L);
            mochaBeans.setMinInventory(5);
            mochaBeans.setMaxInventory(50);
            outsourcedPartRepository.save(mochaBeans);

            OutsourcedPart vanillaCreamer = new OutsourcedPart();
            vanillaCreamer.setCompanyName("Creamer Company");
            vanillaCreamer.setName("French Vanilla");
            vanillaCreamer.setInv(10);
            vanillaCreamer.setPrice(7.25);
            vanillaCreamer.setId(101L);
            vanillaCreamer.setMinInventory(5);
            vanillaCreamer.setMaxInventory(50);
            outsourcedPartRepository.save(vanillaCreamer);

            OutsourcedPart groundEspresso = new OutsourcedPart();
            groundEspresso.setCompanyName("Espresso Company");
            groundEspresso.setName("Ground Espresso");
            groundEspresso.setInv(10);
            groundEspresso.setPrice(9.50);
            groundEspresso.setId(102L);
            groundEspresso.setMinInventory(5);
            groundEspresso.setMaxInventory(50);
            outsourcedPartRepository.save(groundEspresso);

            OutsourcedPart whippedCream = new OutsourcedPart();
            whippedCream.setCompanyName("Whipped Cream Company");
            whippedCream.setName("Whipped Cream");
            whippedCream.setInv(10);
            whippedCream.setPrice(5.25);
            whippedCream.setId(103L);
            whippedCream.setMinInventory(5);
            whippedCream.setMaxInventory(50);
            outsourcedPartRepository.save(whippedCream);

            OutsourcedPart milk = new OutsourcedPart();
            milk.setCompanyName("Milk Company");
            milk.setName("Milk");
            milk.setInv(10);
            milk.setPrice(3.25);
            milk.setId(104L);
            milk.setMinInventory(5);
            milk.setMaxInventory(50);
            outsourcedPartRepository.save(milk);
        }

        /*

        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);

         */

        List<Product> productsList = (List<Product>)productRepository.findAll();
        if (productsList.isEmpty()) {
            Product espressoCoffee = new Product("Espresso Coffee", 20.25, 0);
            productRepository.save(espressoCoffee);

            Product latte = new Product("Latte", 20.25, 0);
            productRepository.save(latte);

            Product cappuccino = new Product("Cappuccino", 20.25, 0);
            productRepository.save(cappuccino);

            Product mocha = new Product("Mocha", 20.25, 0);
            productRepository.save(mocha);

            Product macchiato = new Product("Macchiato", 20.25, 0);
            productRepository.save(macchiato);
        }



        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
