package ksyun.client.vpc.modifynetworkpathname.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyNetworkPathNameRequest
* @Description 请求参数
*/
@Data
public class ModifyNetworkPathNameRequest{
    /**路径分析ID*/
    @KsYunField(name="PathId")
    private String PathId;

    /**路径分析名称*/
    @KsYunField(name="PathName")
    private String PathName;

}
