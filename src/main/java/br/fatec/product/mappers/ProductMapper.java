package br.fatec.product.mappers;

import br.fatec.product.dtos.ProductResponse;
import br.fatec.product.dtos.ProductResquest;
import br.fatec.product.entities.Product;

public class ProductMapper {

    public static Product toEntity(ProductResquest productRequest){
        Product product = new Product();
        product.setName(productRequest.name());
        product.setPrice(productRequest.price());
        product.setCategory(productRequest.category());

        return product;
    }

    public static ProductResponse toDTO(Product product){
        return new ProductResponse(product.getId(),
                                    product.getName(),
                                    product.getPrice(),
                                    product.getCategory());
}    

}
