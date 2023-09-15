package ksyun.client.cen.creatcengrant.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreatCenGrantRequest
* @Description 请求参数
*/
@Data
public class CreatCenGrantRequest{
    /**云企业网的ID*/
    @KsYunField(name="CenId")
    private String CenId;

    /**实例类型*/
    @KsYunField(name="InstanceType")
    private String InstanceType;

    /**云企业网关联的实例ID*/
    @KsYunField(name="CenInstanceId")
    private String CenInstanceId;

    /**云企业网账号的ID*/
    @KsYunField(name="CenAccountId")
    private String CenAccountId;


}