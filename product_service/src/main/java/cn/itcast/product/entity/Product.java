package cn.itcast.product.entity;

        import lombok.Data;

        import javax.persistence.Entity;
        import javax.persistence.Id;
        import javax.persistence.Table;
        import java.math.BigDecimal;
@Data //lombok省略getset
@Entity
@Table(name = "tb_product")
public class Product {
    @Id
    private Long id;
    private String productName;
    private Integer status;
    private BigDecimal price;
    private String caption;
    private String productDesc;
    private Integer inventory;
}
