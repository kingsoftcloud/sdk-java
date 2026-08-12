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
    /**待修改实例保护的文件系统实例ID列表*/
    @KsYunField(name="FileSystemIds",type=2)
    private List<String> FileSystemIdsList;

    /**是否打开资源保护，默认不开启
• TRUE ：表示开启资源删除保护
• FALSE（默认）：表示不开启资源删除保护
*/
    @KsYunField(name="IsProtection")
    private Boolean IsProtection;

}
