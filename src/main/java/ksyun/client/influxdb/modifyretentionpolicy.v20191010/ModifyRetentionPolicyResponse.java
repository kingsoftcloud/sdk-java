package ksyun.client.influxdb.modifyretentionpolicy.v20191010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname ModifyRetentionPolicyResponse
 * @Description ModifyRetentionPolicy 返回体
 */
@Data
@ToString
public class ModifyRetentionPolicyResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
