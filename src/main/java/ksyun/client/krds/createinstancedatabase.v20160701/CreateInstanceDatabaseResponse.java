package ksyun.client.krds.createinstancedatabase.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateInstanceDatabaseResponse
* @Description CreateInstanceDatabase 返回体
*/
@Data
@ToString
public class CreateInstanceDatabaseResponse extends BaseResponseModel {

    /**请求ID	
	–*/
    @JsonProperty("RequestId")
    private String RequestId;

}
