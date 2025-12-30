package ksyun.client.milvus.deletebackup.v20231010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteBackupResponse
* @Description DeleteBackup 返回体
*/
@Data
@ToString
public class DeleteBackupResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /**返回已清除备份id列表*/
    @JsonProperty("Data")
    private List<String> Data;

}
