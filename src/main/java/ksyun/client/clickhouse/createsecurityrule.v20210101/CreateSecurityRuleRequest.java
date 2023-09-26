package ksyun.client.clickhouse.createsecurityrule.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateSecurityRuleRequest
* @Description 请求参数
*/
@Data
public class CreateSecurityRuleRequest{
    /**商品类型：Clickhouse固定取值：523。*/
    @KsYunField(name="ProductType")
    private Integer ProductType;

    /**安全组ID。*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

    /**IP规则列表。IP段采用CIDR地址格式。*/
    @KsYunField(name="Cidrs",type=2)
    private List<String> CidrsList;


}