package ksyun.client.kce2.describenetwork.v20230101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeNetworkRequest
* @Description 请求参数
*/
@Data
public class DescribeNetworkRequest{
    /**集群ID*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**集群名称*/
    @KsYunField(name="ClusterName")
    private String ClusterName;

}
