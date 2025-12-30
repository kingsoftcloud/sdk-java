package ksyun.client.epc.modifyprocess.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyProcessResponse
* @Description ModifyProcess 返回体
*/
@Data
@ToString
public class ModifyProcessResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**确认允许重启的时间
*/
    @JsonProperty("ConfirmTime")
    private String ConfirmTime;

    /**修改后的工单状态
有效值：
• InProgress
• Completed
• UserClose*/
    @JsonProperty("Status")
    private String Status;

    /**操作是否成功*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
