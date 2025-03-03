package ksyun.client.kec.deletemounttarget.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteMountTargetRequest
 * @Description 请求参数
 */
@Data
public class DeleteMountTargetRequest {
    /**
     * 挂载点ID
     */
    @KsYunField(name = "MountTargetId")
    private String MountTargetId;


}