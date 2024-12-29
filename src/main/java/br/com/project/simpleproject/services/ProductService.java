package br.com.project.simpleproject.services;

import br.com.project.simpleproject.model.dtos.ProductReceivedDTO;
import br.com.project.simpleproject.model.entities.Product;
import br.com.project.simpleproject.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService implements IProductService {
    private final ProductRepository productRepository;

    @Override
    public Product createProduct(ProductReceivedDTO productReceivedDTO) {
        Product product = new Product();
        product.setName(productReceivedDTO.getName());
        product.setPrice(productReceivedDTO.getPrice());
        product.setQuantity(productReceivedDTO.getQuantity());
         return productRepository.save(product);
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}

