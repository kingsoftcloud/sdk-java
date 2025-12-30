package ksyun.client.krds.deleteinstancedatabaseaction.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteInstanceDatabaseActionResponse
* @Description DeleteInstanceDatabaseAction 返回体
*/
@Data
@ToString
public class DeleteInstanceDatabaseActionResponse extends BaseResponseModel {

    /**请求ID	
	–*/
    @JsonProperty("RequestId")
    private String RequestId;

}
