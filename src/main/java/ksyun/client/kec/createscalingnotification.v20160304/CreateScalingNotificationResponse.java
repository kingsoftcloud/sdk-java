package ksyun.client.kec.createscalingnotification.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateScalingNotificationResponse
* @Description CreateScalingNotification 返回体
*/
@Data
@ToString
public class CreateScalingNotificationResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /**弹性伸缩id*/
    @JsonProperty("ScalingNotificationId")
    private String ScalingNotificationId;

}
