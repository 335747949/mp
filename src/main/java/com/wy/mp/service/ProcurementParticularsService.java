package com.wy.mp.service;

import com.wy.mp.entity.ProcurementParticulars;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wy.mp.util.PageUtil;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lanwei
 * @since 2020-06-10
 */
public interface ProcurementParticularsService extends IService<ProcurementParticulars> {

    PageUtil queryPage(Map<String ,Object> param);
}
