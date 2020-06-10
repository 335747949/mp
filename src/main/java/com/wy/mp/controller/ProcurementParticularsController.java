package com.wy.mp.controller;


import com.wy.mp.response.BaseResponse;
import com.wy.mp.response.StatusCode;
import com.wy.mp.service.ProcurementParticularsService;
import com.wy.mp.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
