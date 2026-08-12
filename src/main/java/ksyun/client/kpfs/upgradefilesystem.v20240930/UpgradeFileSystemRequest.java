package ksyun.client.kpfs.upgradefilesystem.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpgradeFileSystemRequest
* @Description 请求参数
*/
@Data
public class UpgradeFileSystemRequest{
    /**文件系统的实例ID。*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**文件系统扩容后容量，单位：TiB。*/
    @KsYunField(name="Capacity")
    private Long Capacity;

}
