package vn.iotstar.GraphQL_JWT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.iotstar.GraphQL_JWT.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
