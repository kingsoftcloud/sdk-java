package ksyun.client.clickhouse.unbindsecuritygroup.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UnbindSecurityGroupRequest
* @Description 请求参数
*/
@Data
public class UnbindSecurityGroupRequest{
    /**商品类型：Clickhouse固定取值：523。*/
    @KsYunField(name="ProductType")
    private Integer ProductType;

    /**安全组ID。*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

    /**实例ID列表。*/
    @KsYunField(name="InstanceIds",type=2)
    private List<String> InstanceIdsList;

}
