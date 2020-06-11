package com.wy.mp.controller;


import com.fasterxml.jackson.databind.ser.Serializers;
import com.wy.mp.entity.ProcurementParticulars;
import com.wy.mp.response.BaseResponse;
import com.wy.mp.response.StatusCode;
import com.wy.mp.service.ProcurementParticularsService;
import com.wy.mp.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lanwei
 * @since 2020-06-10
 */
@RestController
@RequestMapping("/mp/procurement")
public class ProcurementParticularsController {

    @Autowired
    private ProcurementParticularsService procurementParticularsService;

    @RequestMapping("/list")
    public BaseResponse list(@RequestParam Map<String ,Object> param){

        BaseResponse response = new BaseResponse(StatusCode.Success);
        Map<String,Object> page = new HashMap<>();
        PageUtil map = procurementParticularsService.queryPage(param);
        page.put("map",map);

        response.setData(page);
        return response;
    }

    //新增
    @RequestMapping("/save")
    public BaseResponse save(@RequestBody ProcurementParticulars particulars){
        BaseResponse response = new BaseResponse(StatusCode.Success);
       try {
           procurementParticularsService.save(particulars);
       }catch (Exception e){
           return new BaseResponse(StatusCode.Fail);
       }
       return response;
    }

    //修改需要先获取详情
    @RequestMapping("/info/{id}")
    public BaseResponse info(@PathVariable Integer id){
        BaseResponse response = new BaseResponse(StatusCode.Success);
        Map<String ,Object> resMap = new HashMap<>();
        resMap.put("particulars",procurementParticularsService.getById(id));
        response.setData(resMap);
        return response;
    }

    //修改
    @RequestMapping("/update")
    public BaseResponse update(@RequestBody ProcurementParticulars particulars) {
        BaseResponse response = new BaseResponse(StatusCode.Success);
        procurementParticularsService.updateById(particulars);
        return response;
    }

    //删除
    @RequestMapping("/delete")
    public BaseResponse delete(@RequestBody Integer id){
        BaseResponse response = new BaseResponse(StatusCode.Success);
        procurementParticularsService.delete(id);
        return response;
    }
}
