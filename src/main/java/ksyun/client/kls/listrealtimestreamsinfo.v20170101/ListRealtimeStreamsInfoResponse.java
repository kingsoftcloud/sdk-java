package ksyun.client.kls.listrealtimestreamsinfo.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListRealtimeStreamsInfoResponse
* @Description ListRealtimeStreamsInfo 返回体
*/
@Data
@ToString
public class ListRealtimeStreamsInfoResponse extends BaseResponseModel {
    /***/
    @JsonProperty("ListRealtimeStreamsInfoResponse")
    private String ListRealtimeStreamsInfoResponse;

}
