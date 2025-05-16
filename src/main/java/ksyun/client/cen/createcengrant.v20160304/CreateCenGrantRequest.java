package ksyun.client.cen.createcengrant.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateCenGrantRequest
 * @Description 请求参数
 */
@Data
public class CreateCenGrantRequest {
    /**
     * 云企业网的ID
     */
    @KsYunField(name = "CenId")
    private String CenId;

    /**
     * 实例类型
     */
    @KsYunField(name = "InstanceType")
    private String InstanceType;

    /**
     * 云企业网关联的实例ID
     */
    @KsYunField(name = "NetworkInstanceId")
    private String NetworkInstanceId;

    /**
     * 云企业网账号的ID
     */
    @KsYunField(name = "CenAccountId")
    private String CenAccountId;

}