package ksyun.client.kes.describecluster.v20201215;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeClusterRequest
* @Description 请求参数
*/
@Data
public class DescribeClusterRequest{
    /**集群ID*/
    @KsYunField(name="ClusterId")
    private String ClusterId;


}