package ksyun.client.krds.deletedbbackup.v20160701;

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
