package ksyun.client.epc.modifysoinstanceattribute.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifySoInstanceAttributeResponse
* @Description ModifySoInstanceAttribute 返回体
*/
@Data
@ToString
public class ModifySoInstanceAttributeResponse extends BaseResponseModel {
    /**4f35e8f7-f549-5c55-9531-5f43ca78*****/
    @JsonProperty("RequestId")
    private String RequestId;

    /**true*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
