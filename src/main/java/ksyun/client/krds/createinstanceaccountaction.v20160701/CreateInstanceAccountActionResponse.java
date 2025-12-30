package ksyun.client.krds.createinstanceaccountaction.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateInstanceAccountActionResponse
* @Description CreateInstanceAccountAction 返回体
*/
@Data
@ToString
public class CreateInstanceAccountActionResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
