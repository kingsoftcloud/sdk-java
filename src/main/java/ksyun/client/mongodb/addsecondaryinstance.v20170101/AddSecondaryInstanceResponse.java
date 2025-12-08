package ksyun.client.mongodb.addsecondaryinstance.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddSecondaryInstanceResponse
* @Description AddSecondaryInstance 返回体
*/
@Data
@ToString
public class AddSecondaryInstanceResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("InstanceId")
    private String InstanceId;

}
