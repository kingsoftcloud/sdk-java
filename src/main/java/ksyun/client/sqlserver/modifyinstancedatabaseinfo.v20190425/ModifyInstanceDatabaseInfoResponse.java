package ksyun.client.sqlserver.modifyinstancedatabaseinfo.v20190425;

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
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
