package ksyun.client.cen.deletecenbandwidthpackage.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteCenBandWidthPackageRequest
* @Description 请求参数
*/
@Data
public class DeleteCenBandWidthPackageRequest{
    /**云企业网带宽包的ID*/
    @KsYunField(name="CenBandWidthPackageId")
    private String CenBandWidthPackageId;

}