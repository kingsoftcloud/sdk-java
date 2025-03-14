package ksyun.client.resourcemanager.createfolder.v20210320;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateFolderResponse
 * @Description CreateFolder 返回体
 */
@Data
@ToString
public class CreateFolderResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
