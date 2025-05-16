package ksyun.client.kmr.listscalehistory.v20210902;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname ListScaleHistoryResponse
 * @Description ListScaleHistory 返回体
 */
@Data
@ToString
public class ListScaleHistoryResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
