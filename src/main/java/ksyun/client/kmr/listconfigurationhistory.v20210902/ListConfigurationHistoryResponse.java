package ksyun.client.kmr.listconfigurationhistory.v20210902;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname ListConfigurationHistoryResponse
* @Description ListConfigurationHistory 返回体
*/
@Data
@ToString
public class ListConfigurationHistoryResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
