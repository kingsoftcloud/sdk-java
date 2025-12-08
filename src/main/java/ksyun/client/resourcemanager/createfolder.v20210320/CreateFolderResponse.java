package ksyun.client.resourcemanager.createfolder.v20210320;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateFolderResponse
* @Description CreateFolder 返回体
*/
@Data
@ToString
public class CreateFolderResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
