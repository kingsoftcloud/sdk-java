package ksyun.client.epc.confirmprocess.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ConfirmProcessResponse
* @Description ConfirmProcess 返回体
*/
@Data
@ToString
public class ConfirmProcessResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**客户确认是否维修完成可恢复业务
有效值：
• Available
• Unavailable*/
    @JsonProperty("UserConfirmAvailable")
    private String UserConfirmAvailable;

    /**客户确认的时间*/
    @JsonProperty("UserConfirmAvailableTime")
    private String UserConfirmAvailableTime;

    /**操作是否成功*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
