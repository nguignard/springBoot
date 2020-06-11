package com.mySite.appli1.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mySite.appli1.model.Product;

@Transactional
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    // public List<Product> findByPrice(Double price);

    public Product findById(int id);

//    public List<Product> findByTagContaining(String tag);
//
//    @Query("select p from Product p where p.tag = :tag")
//    public Product findAProduct(@Param("tag") String tagProduct);
}
