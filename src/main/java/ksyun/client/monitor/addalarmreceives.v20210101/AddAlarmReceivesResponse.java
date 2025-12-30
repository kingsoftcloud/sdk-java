package ksyun.client.monitor.addalarmreceives.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddAlarmReceivesResponse
* @Description AddAlarmReceives 返回体
*/
@Data
@ToString
public class AddAlarmReceivesResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("requestId")
    private String RequestId;

}
