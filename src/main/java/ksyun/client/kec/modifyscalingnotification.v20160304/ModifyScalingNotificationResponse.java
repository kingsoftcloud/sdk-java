package ksyun.client.kec.modifyscalingnotification.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyScalingNotificationResponse
* @Description ModifyScalingNotification 返回体
*/
@Data
@ToString
public class ModifyScalingNotificationResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

    /***/
    @JsonProperty("ScalingNotificationId")
    private String ScalingNotificationId;

}
