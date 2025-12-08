package ksyun.client.bws.associatebandwidthshare.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AssociateBandWidthShareRequest
* @Description 请求参数
*/
@Data
public class AssociateBandWidthShareRequest{
    /**共享带宽的ID*/
    @KsYunField(name="BandWidthShareId")
    private String BandWidthShareId;

    /**弹性IP的ID*/
    @KsYunField(name="AllocationId")
    private String AllocationId;

}
