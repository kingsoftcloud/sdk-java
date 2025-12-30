package ksyun.client.influxdb.modifyretentionpolicy.v20191010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyRetentionPolicyResponse
* @Description ModifyRetentionPolicy 返回体
*/
@Data
@ToString
public class ModifyRetentionPolicyResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
