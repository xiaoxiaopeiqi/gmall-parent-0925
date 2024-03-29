package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author Lfy
 * @since 2019-03-19
 */
public interface ProductService extends IService<Product> {
//分页查询出来的信息
    Map<String,Object> pageProduct(Integer pageSize, Integer pageNum);
}
