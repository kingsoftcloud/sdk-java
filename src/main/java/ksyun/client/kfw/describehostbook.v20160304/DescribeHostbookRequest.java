package ksyun.client.kfw.describehostbook.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeHostbookRequest
* @Description 请求参数
*/
@Data
public class DescribeHostbookRequest{
    /**防火墙实例ID*/
    @KsYunField(name="CfwInstanceId")
    private String CfwInstanceId;

    /**查询的域名簿Id*/
    @KsYunField(name="HostbookIds",type=2)
    private List<String> HostbookIdsList;

    /**最大返回单次调用可返回的最大条目数量. 传入返回的 NextToken 值可以获取剩余的其它条目. 这个值可以允许的范围是 5 - 1000*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token*/
    @KsYunField(name="NextToken")
    private String NextToken;

}
