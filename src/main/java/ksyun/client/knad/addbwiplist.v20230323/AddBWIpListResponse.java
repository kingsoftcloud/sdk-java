package ksyun.client.knad.addbwiplist.v20230323;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddBWIpListResponse
* @Description AddBWIpList 返回体
*/
@Data
@ToString
public class AddBWIpListResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
