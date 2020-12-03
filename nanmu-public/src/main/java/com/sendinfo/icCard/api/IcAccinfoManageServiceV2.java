package com.sendinfo.icCard.api;

import com.sendinfo.common.po.BasePagePO;
import com.sendinfo.icCard.dto.IcAccinfoDTO;
import com.sendinfo.icCard.po.IcAccinfoPO;
import com.sendinfo.icCard.service.IcAccinfoManageService;

public interface IcAccinfoManageServiceV2 extends IcAccinfoManageService {
    public BasePagePO<IcAccinfoPO> getIcAccinfoPage1(IcAccinfoDTO icAccinfoDTO) ;
}
