package ksyun.client.kec.modifyimagesharepermission.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname ModifyImageSharePermissionRequest
 * @Description 请求参数
 */
@Data
public class ModifyImageSharePermissionRequest {
    /**
     * 需要共享的镜像ID。
     * 标准UUID格式，形如^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$
     */
    @KsYunField(name = "ImageId")
    private String ImageId;

    /**
     * 接收分享镜像的账号ID列表。
     * 2000001278
     */
    @KsYunField(name = "AccountId")
    private List<String> AccountIdList;

    /**
     * 操作类型。
     * share，cancel；share为共享，cancel为取消共享
     */
    @KsYunField(name = "Permission")
    private String Permission;

}