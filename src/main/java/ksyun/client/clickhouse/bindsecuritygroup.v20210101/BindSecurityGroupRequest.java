package ksyun.client.clickhouse.bindsecuritygroup.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname BindSecurityGroupRequest
* @Description 请求参数
*/
@Data
public class BindSecurityGroupRequest{
    /**商品类型：Clickhouse固定取值：523。
```json
高可用版:523
单副本版:676
```*/
    @KsYunField(name="ProductType")
    private Integer ProductType;

    /**安全组ID列表。*/
    @KsYunField(name="SecurityGroupIds",type=2)
    private List<String> SecurityGroupIdsList;

    /**实例ID列表。*/
    @KsYunField(name="InstanceIds")
    private String InstanceIds;

}
