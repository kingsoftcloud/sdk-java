package ksyun.client.kpfs.setfilesystemresourceprotect.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetFileSystemResourceProtectResponse
* @Description SetFileSystemResourceProtect 返回体
*/
@Data
@ToString
public class SetFileSystemResourceProtectResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
