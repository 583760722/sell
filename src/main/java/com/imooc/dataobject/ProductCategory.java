package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/19
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory implements Serializable {
    /**类目id.**/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    /**类目名称.**/
    private String categoryName;

    /** 类目编号 **/
    private Integer categoryType;

//    /**创建时间.**/
//    private Date createTime;
//
//    /**修改时间.**/
//    private Date updateTime;
}
