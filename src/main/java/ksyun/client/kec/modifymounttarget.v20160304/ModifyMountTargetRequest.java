package ksyun.client.kec.modifymounttarget.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyMountTargetRequest
* @Description 请求参数
*/
@Data
public class ModifyMountTargetRequest{
    /**文件系统ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**挂载点ID*/
    @KsYunField(name="MountTargetId")
    private String MountTargetId;

    /**权限组ID*/
    @KsYunField(name="AccessGroupId")
    private String AccessGroupId;

}
