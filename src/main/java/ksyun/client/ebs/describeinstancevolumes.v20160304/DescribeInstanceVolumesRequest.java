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
    /**待查询的主机实例ID，现只支持单个查询长度36个字符，包括字母、数字、-*/
    @KsYunField(name="InstanceId")
    private String InstanceId;


}