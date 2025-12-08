package ksyun.client.postgresql.deletedbbackup.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteDBBackupResponse
* @Description DeleteDBBackup 返回体
*/
@Data
@ToString
public class DeleteDBBackupResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
