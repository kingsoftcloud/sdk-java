package ksyun.client.slb.setlbmodificationprotection.v20250430;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetLBModificationProtectionResponse
* @Description SetLBModificationProtection 返回体
*/
@Data
@ToString
public class SetLBModificationProtectionResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**操作是否成功*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
