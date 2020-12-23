package com.ws.spring.cartservice.service;

import com.ws.spring.cartservice.exception.EntityNotFoundException;
import com.ws.spring.cartservice.exception.QuantityNotEnoughException;
import com.ws.spring.cartservice.model.CartProduct;
import com.ws.spring.cartservice.model.Product;
import com.ws.spring.cartservice.model.request.CartProductRequestDTO;
import com.ws.spring.cartservice.repository.CartProductRepository;
import com.ws.spring.cartservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartProductRepository cartProductRepository;
    private final ProductRepository productRepository;

    public List<CartProduct> getCartProducts(String userId){
        return cartProductRepository.findByUserId(userId);
    }

    public void submitCartContent(String userId){
        List<CartProduct> cartProducts = cartProductRepository.findByUserId(userId);
        if(cartProducts.size() > 0){
            for(CartProduct cartProduct : cartProducts){
                isProductValid(cartProduct.getProduct().getId());
            }
        }
        //TODO: create order with cart products.
        //TODO: delete cart products
        //TODO: change return and return order id
    }

    public CartProduct getCartProduct(String cartProductId){
        Optional<CartProduct> optionalCartProduct = cartProductRepository.findById(cartProductId);
        if(optionalCartProduct.isPresent()){
            return optionalCartProduct.get();
        }
        throw new EntityNotFoundException("Cart product not found in the database");
    }

    public CartProduct addCartProduct(CartProductRequestDTO request){
        CartProduct cartProduct = new CartProduct();
        Product product = isProductValid(request.getProductId());

        BeanUtils.copyProperties(request, cartProduct);
        cartProduct.setProduct(product);

        return cartProductRepository.save(cartProduct);
    }

    public CartProduct editCartProduct(String cartProductId, CartProductRequestDTO request){
        Optional<CartProduct> optionalCartProduct = cartProductRepository.findById(cartProductId);
        if(!optionalCartProduct.isPresent()){
            throw new EntityNotFoundException("Cart product not found in the database");
        }
        CartProduct cartProduct = optionalCartProduct.get();
        Product product = isProductValid(request.getProductId());

        BeanUtils.copyProperties(request, cartProduct);
        cartProduct.setProduct(product);

        return cartProductRepository.save(cartProduct);
    }

    public void deleteCartProduct(String cartProductId){
        cartProductRepository.deleteById(cartProductId);
    }

    private Product isProductValid(String productId){
        Optional<Product> optionalProduct = productRepository.findById(productId);
        if(!optionalProduct.isPresent()){
            throw new EntityNotFoundException("Product not found in the database");
        }
        Product product = optionalProduct.get();
        if(product.getQuantity() < 0){
            throw new QuantityNotEnoughException("Not enough quantity for "+product.getName()+" to add to cart");
        }
        return product;
    }
}
