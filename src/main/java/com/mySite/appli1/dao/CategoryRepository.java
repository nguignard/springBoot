package com.mySite.appli1.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mySite.appli1.model.Category;

@Transactional
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {


    // public List<Product> findByPrice(Double price);

    // public Category findById(int id);

//    public List<Product> findByTagContaining(String tag);
//
//    @Query("select p from Product p where p.tag = :tag")
//    public Product findAProduct(@Param("tag") String tagProduct);
}
