package ksyun.client.kfw.describecfweips.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeCfwEipsRequest
* @Description 请求参数
*/
@Data
public class DescribeCfwEipsRequest{
    /**防火墙id*/
    @KsYunField(name="CfwInstanceId")
    private String CfwInstanceId;

    /**查询数量最大1000*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**下一页token*/
    @KsYunField(name="NextToken")
    private String NextToken;

    /**要查询的ip*/
    @KsYunField(name="EipAddress")
    private String EipAddress;

}
