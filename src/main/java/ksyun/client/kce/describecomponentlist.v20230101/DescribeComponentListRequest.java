package ksyun.client.kce.describecomponentlist.v20230101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeComponentListRequest
* @Description 请求参数
*/
@Data
public class DescribeComponentListRequest{
    /**K8S 版本*/
    @KsYunField(name="K8sVersion")
    private String K8sVersion;


}