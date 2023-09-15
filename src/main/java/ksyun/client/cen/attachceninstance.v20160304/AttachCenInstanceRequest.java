package ksyun.client.cen.attachceninstance.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AttachCenInstanceRequest
* @Description 请求参数
*/
@Data
public class AttachCenInstanceRequest{
    /**云企业网的ID*/
    @KsYunField(name="CenId")
    private String CenId;

    /**实例类型*/
    @KsYunField(name="InstanceType")
    private String InstanceType;

    /**金山云地域名称*/
    @KsYunField(name="CenRegion")
    private String CenRegion;

    /**云企业网关联的实例ID*/
    @KsYunField(name="CenInstanceId")
    private String CenInstanceId;

    /**其他账号的ID，当前账号可缺省*/
    @KsYunField(name="InstanceAccountId")
    private String InstanceAccountId;


}