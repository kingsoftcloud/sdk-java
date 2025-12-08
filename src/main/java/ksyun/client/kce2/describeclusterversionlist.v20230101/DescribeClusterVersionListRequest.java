package ksyun.client.kce2.describeclusterversionlist.v20230101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeClusterVersionListRequest
* @Description 请求参数
*/
@Data
public class DescribeClusterVersionListRequest{
    /***/
    @KsYunField(name="K8sVersion")
    private String K8sVersion;

}
