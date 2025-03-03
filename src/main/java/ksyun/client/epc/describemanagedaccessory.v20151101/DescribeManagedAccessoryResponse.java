package ksyun.client.epc.describemanagedaccessory.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeManagedAccessoryResponse
 * @Description DescribeManagedAccessory 返回体
 */
@Data
@ToString
public class DescribeManagedAccessoryResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
