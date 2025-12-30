package ksyun.client.kec.describekecinventory.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeKecInventoryRequest
* @Description 请求参数
*/
@Data
public class DescribeKecInventoryRequest{
    /**云服务器的实例规格。*/
    @KsYunField(name="InstanceType")
    private String InstanceType;

    /**可用区。*/
    @KsYunField(name="AvailabilityZone")
    private String AvailabilityZone;

}
