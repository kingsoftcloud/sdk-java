package ksyun.client.kmr.describecluster.v20210902;

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
    /**集群id*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

}
