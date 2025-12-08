package ksyun.client.influxdb.createretentionpolicy.v20191010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateRetentionPolicyResponse
* @Description CreateRetentionPolicy 返回体
*/
@Data
@ToString
public class CreateRetentionPolicyResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
