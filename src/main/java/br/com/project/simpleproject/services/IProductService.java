package br.com.project.simpleproject.services;

import br.com.project.simpleproject.model.dtos.ProductReceivedDTO;
import br.com.project.simpleproject.model.entities.Product;


public interface IProductService {
    Product createProduct(ProductReceivedDTO productReceivedDTO);

    Product getProduct(Long id);
}
