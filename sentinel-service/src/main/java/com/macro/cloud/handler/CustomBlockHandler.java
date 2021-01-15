package com.macro.cloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.macro.cloud.domain.CommonResult;

/**
 * Created by macro on 2019/11/7.
 */
public class CustomBlockHandler {


    /**
     * 自定义异常不在方法同类时，需要定义成static，否则无法解析
     * @param exception
     * @return
     */
    public static CommonResult handleException(BlockException exception){
        return new CommonResult("自定义限流信息",200);
    }
}
