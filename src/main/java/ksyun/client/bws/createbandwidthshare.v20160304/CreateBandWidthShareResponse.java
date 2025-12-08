package ksyun.client.bws.createbandwidthshare.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateBandWidthShareResponse
* @Description CreateBandWidthShare 返回体
*/
@Data
@ToString
public class CreateBandWidthShareResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**共享带宽的ID*/
    @JsonProperty("BandWidthShareId")
    private String BandWidthShareId;

    /**共享带宽的带宽*/
    @JsonProperty("BandWidth")
    private Integer BandWidth;

    /**共享带宽的名称*/
    @JsonProperty("BandWidthShareName")
    private String BandWidthShareName;

    /**共享带宽创建时间*/
    @JsonProperty("CreateTime")
    private String CreateTime;

    /**线路类型的ID*/
    @JsonProperty("LineId")
    private String LineId;

}
