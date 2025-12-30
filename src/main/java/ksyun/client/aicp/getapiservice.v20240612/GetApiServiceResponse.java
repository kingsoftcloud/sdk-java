package ksyun.client.aicp.getapiservice.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetApiServiceResponse
* @Description GetApiService 返回体
*/
@Data
@ToString
public class GetApiServiceResponse extends BaseResponseModel {

    /**开通状态：-1未开通，1已开通正常，2已开通欠费停机*/
    @JsonProperty("Status")
    private Integer Status;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
