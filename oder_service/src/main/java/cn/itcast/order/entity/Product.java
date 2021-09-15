package cn.itcast.order.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data //lombok省略getset
public class Product {
    private Long id;
    private String productName;
    private Integer status;
    private BigDecimal price;
    private String caption;
    private String productDesc;
    private Integer inventory;
}
