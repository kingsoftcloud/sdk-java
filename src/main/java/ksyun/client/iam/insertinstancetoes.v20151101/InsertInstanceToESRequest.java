package ksyun.client.iam.insertinstancetoes.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname InsertInstanceToESRequest
 * @Description 请求参数
 */
@Data
public class InsertInstanceToESRequest {
    /***/
    @KsYunField(name = "ProjectId")
    private Integer ProjectId;

    /***/
    @KsYunField(name = "ProductLine")
    private String ProductLine;

    /***/
    @KsYunField(name = "ProductGroup")
    private Integer ProductGroup;

    /***/
    @KsYunField(name = "ResourceType")
    private String ResourceType;

    /***/
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /***/
    @KsYunField(name = "RegionEn")
    private String RegionEn;

    /***/
    @KsYunField(name = "InstanceName")
    private String InstanceName;


}