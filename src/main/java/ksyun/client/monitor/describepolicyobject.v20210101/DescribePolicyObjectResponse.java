package ksyun.client.monitor.describepolicyobject.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname DescribePolicyObjectResponse
 * @Description DescribePolicyObject 返回体
 */
@Data
@ToString
public class DescribePolicyObjectResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
