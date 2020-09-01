package com.wy.mp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
import java.util.Set;

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

/*        IPage page = new QueryUtil<ProcurementParticulars>().getQueryPage(param);
//        IPage resPage = page(page,null);
//        return new PageUtil(resPage);

        List<ProcurementParticulars> list = baseMapper.queryPage(page,param);
        page.setRecords(list);
        return new PageUtil(page);*/

        /**
         * 直接获取拿到的参数，进行模糊分页查询，无需自己写自定义sql；
         */
        //设置查询条件
        QueryWrapper<ProcurementParticulars> wrapper = new QueryWrapper<>();
        Set<String> set = param.keySet();
        for (String key : set) {
            wrapper.eq(param.get(key) != null,key,param.get(key));
        }
        IPage<ProcurementParticulars> queryPage = new QueryUtil<ProcurementParticulars>().getQueryPage(param);
        IPage<ProcurementParticulars> page = baseMapper.selectPage(queryPage, wrapper);
        return new PageUtil(page);
    }

    @Override
    public void delete(Integer id) {
        removeById(id);
    }
}
