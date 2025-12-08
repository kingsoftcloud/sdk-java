package ksyun.client.monitor.deletealarmreceives.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteAlarmReceivesResponse
* @Description DeleteAlarmReceives 返回体
*/
@Data
@ToString
public class DeleteAlarmReceivesResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("requestId")
    private String RequestId;

}
