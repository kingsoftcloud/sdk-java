package ksyun.client.sqlserver.describesecuritygroup.v20190425;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeSecurityGroupRequest
* @Description 请求参数
*/
@Data
public class DescribeSecurityGroupRequest{
    /**安全组ID*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

}
