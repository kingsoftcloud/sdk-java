package ksyun.client.slb.setlbdeleteprotection.v20250430;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetLBDeleteProtectionResponse
* @Description SetLBDeleteProtection 返回体
*/
@Data
@ToString
public class SetLBDeleteProtectionResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**操作是否成功*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
