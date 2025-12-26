package ksyun.client.monitor.listalarmeffectinstance.v20250101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname ListAlarmEffectInstanceResponse
* @Description ListAlarmEffectInstance 返回体
*/
@Data
@ToString
public class ListAlarmEffectInstanceResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
