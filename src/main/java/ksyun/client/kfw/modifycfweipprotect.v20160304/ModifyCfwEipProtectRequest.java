package ksyun.client.kfw.modifycfweipprotect.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyCfwEipProtectRequest
* @Description 请求参数
*/
@Data
public class ModifyCfwEipProtectRequest{
    /**防火墙id*/
    @KsYunField(name="CfwInstanceId")
    private String CfwInstanceId;

    /**eip的主键id集合*/
    @KsYunField(name="EipIds",type=2)
    private List<String> EipIdsList;

    /**防护状态(start|stop)*/
    @KsYunField(name="EipProtectStatus")
    private String EipProtectStatus;

}
