package ksyun.client.kcs.describesecuritygroup.v20160701;

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
    /**可用区			默认：对应机房的a区*/
    @KsYunField(name="AvailableZone")
    private String AvailableZone;

    /**安全组ID	安全组规则ID*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

    /**查询条件		根据IP进行过滤*/
    @KsYunField(name="SearchKey")
    private String SearchKey;

    /**数据偏移量	默认：0*/
    @KsYunField(name="Offset")
    private String Offset;

    /**每页最大数量		默认：1000，最大值1000*/
    @KsYunField(name="Limit")
    private Integer Limit;


}