package client.ebs.describeebsinstances.v20160304;
import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeEbsInstancesRequest
* @Description 请求参数
*/
@Data
public class DescribeEbsInstancesRequest{
    /**指定获取某个AZ的可用主机*/
    @KsYunField(name="AvailabilityZone")
    private String AvailabilityZone;

    /**硬盘类型，三种，SSD2.0/SSD3.0/EHDD*/
    @KsYunField(name="VolumeType")
    private String VolumeType;


}