package ksyun.client.krds.modifyinstanceaccountinfo.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyInstanceAccountInfoResponse
* @Description ModifyInstanceAccountInfo 返回体
*/
@Data
@ToString
public class ModifyInstanceAccountInfoResponse extends BaseResponseModel {

    /**请求ID	
–*/
    @JsonProperty("RequestId")
    private String RequestId;

}
