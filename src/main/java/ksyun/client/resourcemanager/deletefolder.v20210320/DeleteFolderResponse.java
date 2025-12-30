package ksyun.client.resourcemanager.deletefolder.v20210320;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteFolderResponse
* @Description DeleteFolder 返回体
*/
@Data
@ToString
public class DeleteFolderResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
