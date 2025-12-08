package ksyun.client.kcrs.getretentionpolicylog.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetRetentionPolicyLogResponse
* @Description GetRetentionPolicyLog 返回体
*/
@Data
@ToString
public class GetRetentionPolicyLogResponse extends BaseResponseModel {
    /**结果字符串*/
    @JsonProperty("Data")
    private String Data;

}
