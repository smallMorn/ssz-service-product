package com.ssz.service.product.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ssz
 * @since 2021-01-13
 */
@Data
@Accessors(chain = true)
public class Product implements Serializable {

    @TableId(value = "product_id", type = IdType.INPUT)
    private String productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 销售价格
     */
    private BigDecimal salePrice;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreated;

    /**
     * 修改时间
     */
    private LocalDateTime gmtModified;


}