package ksyun.client.kcrs.startimagescan.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StartImageScanResponse
* @Description StartImageScan 返回体
*/
@Data
@ToString
public class StartImageScanResponse extends BaseResponseModel {
    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
