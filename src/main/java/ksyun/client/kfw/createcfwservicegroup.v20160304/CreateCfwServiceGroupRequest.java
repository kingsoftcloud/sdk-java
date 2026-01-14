package ksyun.client.kfw.createcfwservicegroup.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateCfwServiceGroupRequest
* @Description 请求参数
*/
@Data
public class CreateCfwServiceGroupRequest{
    /**云防火墙id*/
    @KsYunField(name="CfwInstanceId")
    private String CfwInstanceId;

    /**服务组名称*/
    @KsYunField(name="ServiceGroupName")
    private String ServiceGroupName;

    /**服务信息（最多添加64个）服务信息（协议:源端口最小-源端口最大/目的最小-目的最大 ）
例：TCP:1-100/2-200,UDP:22/33,ICMP
*/
    @KsYunField(name="ServiceInfo",type=2)
    private List<String> ServiceInfoList;

    /**描述*/
    @KsYunField(name="Description")
    private String Description;

}
