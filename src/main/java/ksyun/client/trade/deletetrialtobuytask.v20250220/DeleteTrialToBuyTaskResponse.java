package ksyun.client.trade.deletetrialtobuytask.v20250220;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteTrialToBuyTaskResponse
* @Description DeleteTrialToBuyTask 返回体
*/
@Data
@ToString
public class DeleteTrialToBuyTaskResponse extends BaseResponseModel {

    /**本次请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**是否取消定时转正任务。true-成功，false-失败*/
    @JsonProperty("success")
    private Boolean Success;

}
