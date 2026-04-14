package ksyun.client.kpfs.setfilesystemresourceprotect.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetFileSystemResourceProtectRequest
* @Description 请求参数
*/
@Data
public class SetFileSystemResourceProtectRequest{
    /***/
    @KsYunField(name="FileSystemIds",type=2)
    private List<String> FileSystemIdsList;

    /***/
    @KsYunField(name="IsProtection")
    private Boolean IsProtection;

}
