package ksyun.client.krds.modifyinstancedatabaseinfo.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyInstanceDatabaseInfoResponse
* @Description ModifyInstanceDatabaseInfo 返回体
*/
@Data
@ToString
public class ModifyInstanceDatabaseInfoResponse extends BaseResponseModel {

    /**请求ID	
	–*/
    @JsonProperty("RequestId")
    private String RequestId;

}
