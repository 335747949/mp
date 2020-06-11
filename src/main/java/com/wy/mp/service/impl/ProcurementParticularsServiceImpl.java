package com.wy.mp.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wy.mp.entity.ProcurementParticulars;
import com.wy.mp.mapper.ProcurementParticularsMapper;
import com.wy.mp.service.ProcurementParticularsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wy.mp.util.PageUtil;
import com.wy.mp.util.QueryUtil;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lanwei
 * @since 2020-06-10
 */
@Service
public class ProcurementParticularsServiceImpl extends ServiceImpl<ProcurementParticularsMapper, ProcurementParticulars> implements ProcurementParticularsService {

    @Override
    public PageUtil queryPage(Map<String, Object> param) {

        IPage page = new QueryUtil<ProcurementParticulars>().getQueryPage(param);
//        IPage resPage = page(page,null);
//        return new PageUtil(resPage);

        List<ProcurementParticulars> list = baseMapper.queryPage(page,param);
        page.setRecords(list);
        return new PageUtil(page);
    }

    @Override
    public void delete(Integer id) {
        removeById(id);
    }
}
