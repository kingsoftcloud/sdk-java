package ksyun.client.krds.describesecuritygroup.v20200825;

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
    /**安全组ID列表，不传的时候返回列表，传值展示指定ID的安全组信息。支持批量查询。*/
    @KsYunField(name="SecurityGroupId",type=2)
    private List<String> SecurityGroupIdList;

    /**取值范围：IPV4 / IPV6 （默认IPV4）*/
    @KsYunField(name="SecurityGroupType")
    private String SecurityGroupType;

}
