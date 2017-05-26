package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.vo.MallConfigVo;

/**
 * Created by akku on 2017/5/26.
 * 商城配置信息
 */

public interface IMallConfigService {

    ServerResponse<MallConfigVo> info();
}
