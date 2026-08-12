package ksyun.client.kpfs.renewfilesystem.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RenewFileSystemRequest
* @Description 请求参数
*/
@Data
public class RenewFileSystemRequest{
    /**文件系统的实例ID。*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**购买时长。有效值：1~60，单位：月。*/
    @KsYunField(name="PurchaseTime")
    private Long PurchaseTime;

}
