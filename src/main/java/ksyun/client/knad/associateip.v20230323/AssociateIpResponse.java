package ksyun.client.knad.associateip.v20230323;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AssociateIpResponse
* @Description AssociateIp 返回体
*/
@Data
@ToString
public class AssociateIpResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

    /***/
    @JsonProperty("FailEips")
    private List<String> FailEips;

}
