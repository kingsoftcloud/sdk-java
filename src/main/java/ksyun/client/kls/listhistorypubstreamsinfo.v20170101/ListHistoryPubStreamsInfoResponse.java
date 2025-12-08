package ksyun.client.kls.listhistorypubstreamsinfo.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListHistoryPubStreamsInfoResponse
* @Description ListHistoryPubStreamsInfo 返回体
*/
@Data
@ToString
public class ListHistoryPubStreamsInfoResponse extends BaseResponseModel {
    /***/
    @JsonProperty("ListHistoryPubStreamsInfoResponse")
    private String ListHistoryPubStreamsInfoResponse;

}
