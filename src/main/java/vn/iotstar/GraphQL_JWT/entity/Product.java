package vn.iotstar.GraphQL_JWT.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")

public class Product {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private String title;

	    @Column(nullable = false)
	    private int quantity;

	    @Column(length = 500)
	    private String desc;

	    @ManyToOne
	    @JoinColumn(name = "user_id", nullable = false)
	    private User user;
}
