package ksyun.client.bws.deletebandwidthshare.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteBandWidthShareRequest
* @Description 请求参数
*/
@Data
public class DeleteBandWidthShareRequest{
    /**共享带宽的ID*/
    @KsYunField(name="BandWidthShareId")
    private String BandWidthShareId;


}