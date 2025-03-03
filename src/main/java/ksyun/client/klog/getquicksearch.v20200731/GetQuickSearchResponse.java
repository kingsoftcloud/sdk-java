package ksyun.client.klog.getquicksearch.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname GetQuickSearchResponse
 * @Description GetQuickSearch 返回体
 */
@Data
@ToString
public class GetQuickSearchResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
