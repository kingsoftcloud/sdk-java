package ksyun.client.clickhouse.clonesecuritygroup.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CloneSecurityGroupRequest
* @Description 请求参数
*/
@Data
public class CloneSecurityGroupRequest{
    /**商品类型：Clickhouse固定取值：523。*/
    @KsYunField(name="ProductType")
    private Integer ProductType;

    /**被克隆安全组ID。*/
    @KsYunField(name="SrcSecurityGroupId")
    private String SrcSecurityGroupId;

    /**新安全组名称。*/
    @KsYunField(name="SecurityGroupName")
    private String SecurityGroupName;

    /**新安全组描述。*/
    @KsYunField(name="Description")
    private String Description;


}