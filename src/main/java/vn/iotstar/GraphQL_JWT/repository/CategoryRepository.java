package vn.iotstar.GraphQL_JWT.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.iotstar.GraphQL_JWT.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	List<Category> findByUserId(Long userId);
}
