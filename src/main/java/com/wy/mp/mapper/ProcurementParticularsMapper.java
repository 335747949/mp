package com.wy.mp.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wy.mp.entity.ProcurementParticulars;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lanwei
 * @since 2020-06-10
 */
public interface ProcurementParticularsMapper extends BaseMapper<ProcurementParticulars> {

    List<ProcurementParticulars> queryPage(IPage<ProcurementParticulars> page, @Param("paramMap")Map<String ,Object> paramMap);

}
