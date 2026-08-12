package ksyun.client.kpfs.deleterecyclebinconfig.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteRecycleBinConfigRequest
* @Description 请求参数
*/
@Data
public class DeleteRecycleBinConfigRequest{
    /**文件系统ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

}
