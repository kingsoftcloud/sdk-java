package ksyun.client.ebs.describeinstancevolumes.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeInstanceVolumesRequest
* @Description 请求参数
*/
@Data
public class DescribeInstanceVolumesRequest{
    /***/
    @KsYunField(name="InstanceId")
    private String InstanceId;

}
