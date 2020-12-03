package com.sendinfo.icCard.api.impl;


import com.sendinfo.common.po.BasePagePO;
import com.sendinfo.common.util.PageUtil;
import com.sendinfo.common.util.StrUtil;
import com.sendinfo.core.model.DataGrid;
import com.sendinfo.core.model.Page;
import com.sendinfo.icCard.api.IcAccinfoManageServiceV2;
import com.sendinfo.icCard.biz.*;
import com.sendinfo.icCard.dto.IcAccinfoAssistDTO;
import com.sendinfo.icCard.dto.IcAccinfoDTO;
import com.sendinfo.icCard.po.IcAccinfoAssistPO;
import com.sendinfo.icCard.po.IcAccinfoPO;
import com.sendinfo.icCard.service.IcAccinfoAssistManageService;
import com.xiaoleilu.hutool.util.CollectionUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @version V1
 * @Description：年卡账户信息表 Service
 * 原理：
 * 业务流程：年卡账户信息表基础CURD（根据业务维护）
 * @author: 楠木
 * @date:2019-11-14 15:28:01
 */
@Slf4j
@Service
public class IcAccInfoManageServiceImplV2 extends IcAccInfoManageServiceImplV1 implements IcAccinfoManageServiceV2 {


    @Autowired
    private IcAccinfoBiz icAccinfoBiz;

    @Autowired
    private IcAccinfoAssistManageService icAccinfoAssistManageService;


    /***
     *
     * @Title: saveIcAccinfo
     * @Description: 分页查询年卡账户信息表
     * @param: IcAccinfoDTO icAccinfoDTO
     * @return: BasePagePo<IcAccinfoPO>
     * @author: 楠木
     * @date: 2019-11-14 15:28:01
     * @version V1
     * @throws （有异常加以说明，触发条件）NullPointerException
     * @modify
     * @修改人:
     * @修改日期:
     * @修改原因:
     * @修改描述:
     */
    @Override
    public BasePagePO<IcAccinfoPO> getIcAccinfoPage(IcAccinfoDTO icAccinfoDTO) {
        log.info("版本2,class:【IcAccinfoDubboServiceImplV1 】,method:【pageIcAccinfo】");
        //创建Example实体对象
        // Example example = new Example(IcAccinfo.class);
        //创建criteria放查询条件使用
        //Example.Criteria criteria = example.createCriteria();
        //todo  添加查询条件:记得非空判断以及其他判断
        //创建Page111
        Page page = PageUtil.getPage(icAccinfoDTO);
        //调用BIZ分页方法
        DataGrid pageList = icAccinfoBiz.pageIcAccinfo(icAccinfoDTO, page);
        //将年卡绑定的用户名字用逗号隔开展示
        List<IcAccinfoPO> list = pageList.getRows();
        if (CollectionUtil.isNotEmpty(list)) {
            list.stream().forEach(item -> {
                IcAccinfoAssistDTO icAccinfoAssistDTO = new IcAccinfoAssistDTO();
                icAccinfoAssistDTO.setIcAccinfoId(item.getId());
                List<String> nameList = new ArrayList<>();
                List<IcAccinfoAssistPO> assistPOList = icAccinfoAssistManageService.getIcAccinfoAssistList(icAccinfoAssistDTO);
                if (CollectionUtil.isNotEmpty(assistPOList)) {
                    assistPOList.stream().forEach(assItem -> {
                        nameList.add(assItem.getAccName());
                    });
                }
                item.setAccName(StrUtil.changeList(nameList));
            });
        }
        //对象转换PO
        BasePagePO<IcAccinfoPO> icAccinfoPOBasePagePo = PageUtil.pageToPO(pageList, IcAccinfoPO.class);
        log.info("【查询分页年卡账户信息表列表】===结束");
        //返回
        return icAccinfoPOBasePagePo;
    }




    @Override
    public BasePagePO<IcAccinfoPO> getIcAccinfoPage1(IcAccinfoDTO icAccinfoDTO) {
        log.info("个性化版本2");
        return new BasePagePO<IcAccinfoPO>();
    }
}