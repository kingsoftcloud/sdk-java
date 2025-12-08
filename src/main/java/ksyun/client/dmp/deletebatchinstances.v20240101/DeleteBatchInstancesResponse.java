package ksyun.client.dmp.deletebatchinstances.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteBatchInstancesResponse
* @Description DeleteBatchInstances 返回体
*/
@Data
@ToString
public class DeleteBatchInstancesResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private String Data;

}
