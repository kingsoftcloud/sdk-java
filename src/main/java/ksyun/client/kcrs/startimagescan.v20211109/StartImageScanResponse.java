package ksyun.client.kcrs.startimagescan.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname StartImageScanResponse
 * @Description StartImageScan 返回体
 */
@Data
@ToString
public class StartImageScanResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
