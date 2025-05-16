package ksyun.client.sqlserver.modifyinstancedatabaseinfo.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname ModifyInstanceDatabaseInfoResponse
 * @Description ModifyInstanceDatabaseInfo 返回体
 */
@Data
@ToString
public class ModifyInstanceDatabaseInfoResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
