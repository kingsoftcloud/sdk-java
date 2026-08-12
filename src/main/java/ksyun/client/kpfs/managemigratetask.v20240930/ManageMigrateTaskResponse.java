package ksyun.client.kpfs.managemigratetask.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ManageMigrateTaskResponse
* @Description ManageMigrateTask 返回体
*/
@Data
@ToString
public class ManageMigrateTaskResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

}
