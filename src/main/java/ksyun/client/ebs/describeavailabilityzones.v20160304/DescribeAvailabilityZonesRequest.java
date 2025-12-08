package ksyun.client.ebs.describeavailabilityzones.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeAvailabilityZonesRequest
* @Description 请求参数
*/
@Data
public class DescribeAvailabilityZonesRequest{
    /**云盘类型，可选值：SSD3.0、EHDD、ESSD_PL0、ESSD_PL1、ESSD_PL2、ESSD_PL3、ESSD_Entry、ESSD_AutoPL*/
    @KsYunField(name="VolumeType")
    private String VolumeType;

}
