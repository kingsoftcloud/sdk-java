package ksyun.client.cdn.setcdnblockdomainurl.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetCdnBlockDomainUrlResponse
* @Description SetCdnBlockDomainUrl 返回体
*/
@Data
@ToString
public class SetCdnBlockDomainUrlResponse extends BaseResponseModel {

    /**任务Id*/
    @JsonProperty("TaskId")
    private String TaskId;

}
