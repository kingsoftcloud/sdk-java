package ksyun.client.cen.detachceninstance.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DetachCenInstanceRequest
* @Description 请求参数
*/
@Data
public class DetachCenInstanceRequest{
    /**云企业网的ID*/
    @KsYunField(name="CenId")
    private String CenId;

    /**云企业网关联的实例ID*/
    @KsYunField(name="CenInstanceId")
    private String CenInstanceId;


}