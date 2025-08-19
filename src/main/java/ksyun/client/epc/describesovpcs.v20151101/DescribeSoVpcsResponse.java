package ksyun.client.epc.describesovpcs.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DescribeSoVpcsResponse
* @Description DescribeSoVpcs 返回体
*/
@Data
@ToString
public class DescribeSoVpcsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
