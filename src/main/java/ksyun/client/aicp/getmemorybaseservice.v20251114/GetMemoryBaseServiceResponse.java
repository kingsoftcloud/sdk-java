package ksyun.client.aicp.getmemorybaseservice.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetMemoryBaseServiceResponse
* @Description GetMemoryBaseService 返回体
*/
@Data
@ToString
public class GetMemoryBaseServiceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /**仅 CREATE_SUCCESS 表示已经开通，其他情况需要开通。*/
    @JsonProperty("Status")
    private String Status;

}
