package ksyun.client.kmr.deletescalestrategy.v20210902;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteScaleStrategyResponse
* @Description DeleteScaleStrategy 返回体
*/
@Data
@ToString
public class DeleteScaleStrategyResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**集群ID*/
    @JsonProperty("ClusterId")
    private String ClusterId;

    /**是否成功*/
    @JsonProperty("Succeed")
    private Boolean Succeed;

    /**状态码*/
    @JsonProperty("StatusCode")
    private Integer StatusCode;

}
