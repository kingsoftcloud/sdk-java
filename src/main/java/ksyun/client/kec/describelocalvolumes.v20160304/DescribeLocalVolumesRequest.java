package ksyun.client.kec.describelocalvolumes.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeLocalVolumesRequest
* @Description 请求参数
*/
@Data
public class DescribeLocalVolumesRequest{
    /**实例名字*/
    @KsYunField(name="InstanceName")
    private String InstanceName;


}