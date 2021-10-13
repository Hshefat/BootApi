/**
 * 
 */
package com.sts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sts.entity.Product;

/**
 * @author PC
 *
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
