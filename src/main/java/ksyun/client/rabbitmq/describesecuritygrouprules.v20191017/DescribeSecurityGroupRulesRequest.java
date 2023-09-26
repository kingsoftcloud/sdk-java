package ksyun.client.rabbitmq.describesecuritygrouprules.v20191017;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeSecurityGroupRulesRequest
* @Description 请求参数
*/
@Data
public class DescribeSecurityGroupRulesRequest{
    /**实例Id。*/
    @KsYunField(name="InstanceId")
    private String InstanceId;


}