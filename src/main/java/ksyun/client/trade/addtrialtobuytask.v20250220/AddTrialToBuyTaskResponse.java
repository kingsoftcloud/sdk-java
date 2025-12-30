package ksyun.client.trade.addtrialtobuytask.v20250220;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddTrialToBuyTaskResponse
* @Description AddTrialToBuyTask 返回体
*/
@Data
@ToString
public class AddTrialToBuyTaskResponse extends BaseResponseModel {

    /**本次请求的唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**试用转正任务是否添加成功。true-成功，false-失败*/
    @JsonProperty("success")
    private Boolean Success;

}
