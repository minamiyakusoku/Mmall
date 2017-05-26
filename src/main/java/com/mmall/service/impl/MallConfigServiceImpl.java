package com.mmall.service.impl;

import com.mmall.common.ServerResponse;
import com.mmall.service.IMallConfigService;
import com.mmall.util.PropertiesUtil;
import com.mmall.vo.MallConfigVo;
import org.springframework.stereotype.Service;

/**
 * Created by akku on 2017/5/26.
 */
@Service("iMallConfigService")
public class MallConfigServiceImpl implements IMallConfigService{
    @Override
    public ServerResponse<MallConfigVo> info() {
        return ServerResponse.createBySuccess(initMallConfigVo());
    }


    private MallConfigVo initMallConfigVo(){
        MallConfigVo mallConfigVo = new MallConfigVo();
        mallConfigVo.setMallName(PropertiesUtil.getProperty("mall.name","艾草线上销售平台"));
        mallConfigVo.setMallShortName(PropertiesUtil.getProperty("mall.shortname","艾草商城"));
        mallConfigVo.setMallEnName(PropertiesUtil.getProperty("mall.enname","AiJiaMall"));
        mallConfigVo.setLogo(PropertiesUtil.getProperty("logo","logo.jpg"));
        mallConfigVo.setSmallLogo(PropertiesUtil.getProperty("small.logo","smalllogo.jpg"));
        mallConfigVo.setServiceTel(PropertiesUtil.getProperty("service.tel","400-123-456"));
        mallConfigVo.setCompanyName(PropertiesUtil.getProperty("company.name","艾家艾草公司"));
        mallConfigVo.setCompanyShortName(PropertiesUtil.getProperty("company.shortname","艾家"));
        mallConfigVo.setCompanyEnName(PropertiesUtil.getProperty("company.enanme","AiJia"));
        mallConfigVo.setNetName(PropertiesUtil.getProperty("company.netname","aijia.com"));
        mallConfigVo.setCompanyEmail(PropertiesUtil.getProperty("company.email","service@aijia.com"));
        mallConfigVo.setCompanyTel(PropertiesUtil.getProperty("company.tel","010-1234567"));
        mallConfigVo.setRecordCode(PropertiesUtil.getProperty("record.code","京 ICP 证 1234567 号"));
        mallConfigVo.setLoginBg(PropertiesUtil.getProperty("login.bg","loginbg.jpg"));
        mallConfigVo.setImgHost(PropertiesUtil.getProperty("ftp.mall.config.server.http.prefix","http://img.happymmall.com/"));
        return mallConfigVo;
    }
}
