package ksyun.client.ebs.validateattachinstance.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ValidateAttachInstanceResponse
* @Description ValidateAttachInstance 返回体
*/
@Data
@ToString
public class ValidateAttachInstanceResponse extends BaseResponseModel {
    /**请求流水号*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**true表示可用，False表示挂盘超出限制或其他条件导致不可用*/
    @JsonProperty("InstanceEnable")
    private String InstanceEnable;

}
