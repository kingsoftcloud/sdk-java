package ksyun.client.bws.disassociatebandwidthshare.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DisassociateBandWidthShareRequest
* @Description 请求参数
*/
@Data
public class DisassociateBandWidthShareRequest{
    /**共享带宽的ID*/
    @KsYunField(name="BandWidthShareId")
    private String BandWidthShareId;

    /**弹性IP的ID*/
    @KsYunField(name="AllocationId")
    private String AllocationId;

    /**弹性IP的带宽*/
    @KsYunField(name="BandWidth")
    private Integer BandWidth;

}
