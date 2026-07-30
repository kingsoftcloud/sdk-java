package ksyun.client.aicp.removestorageconfigaccess.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RemoveStorageConfigAccessResponse
* @Description RemoveStorageConfigAccess 返回体
*/
@Data
@ToString
public class RemoveStorageConfigAccessResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**存储配置ID*/
    @JsonProperty("StorageConfigId")
    private String StorageConfigId;

}
