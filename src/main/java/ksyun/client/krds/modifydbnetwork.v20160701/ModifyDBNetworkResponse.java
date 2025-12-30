package ksyun.client.krds.modifydbnetwork.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyDBNetworkResponse
* @Description ModifyDBNetwork 返回体
*/
@Data
@ToString
public class ModifyDBNetworkResponse extends BaseResponseModel {

    /**请求ID	
	–*/
    @JsonProperty("RequestId")
    private String RequestId;

}
