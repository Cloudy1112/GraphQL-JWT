package vn.iotstar.GraphQL_JWT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.iotstar.GraphQL_JWT.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
